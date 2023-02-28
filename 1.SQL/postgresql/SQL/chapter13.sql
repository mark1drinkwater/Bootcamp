SELECT upper('hello');

SELECT initcap('mark drinkwater');

SELECT char_length(' Pat ');
SELECT length(' Pat ');

SELECT position(', ' in 'Tan, Bella');

SELECT trim('s' from 'socks');

SELECT ltrim('socks', 's');
SELECT rtrim('socks', 's');

SELECT left('703-555-1212', 3);
SELECT right('703-555-1212', 3);
SELECT right('703-555-1212', 8);

SELECT replace('bat','b','c');

-- Regular Expressions --
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from '\d{4}');
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from '.+');
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from '^\w+');
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from '\w+.$');
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from 'May|June');
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from '\d{4}');
SELECT substring('The game starts at 7 p.m. on May 2, 2019.' from 'May \d, \d{4}');

CREATE TABLE crime_reports (
	crime_id bigserial PRIMARY KEY,
	date_1 timestamp with time zone,
	date_2 timestamp with time zone,
	street varchar(250),
	city varchar(100),
	crime_type varchar(100),
	description text,
	case_number varchar(50),
	original_text text NOT NULL
);

COPY crime_reports (original_text)
FROM 'C:\Users\Mark\Documents\Bootcamp\1.SQL\postgresql\practical-sql-main\Chapter_13\crime_reports.csv'
WITH (FORMAT CSV, HEADER OFF, QUOTE '"');

SELECT original_text FROM crime_reports;

-- Extract first date (only first match) --
SELECT crime_id,
regexp_match(original_text, '\d{1,2}\/\d{1,2}\/\d{2}')
FROM crime_reports;

-- Extract all dates (all matches) using 'g' flag and MATCHES instead of MATCH --
SELECT crime_id,
regexp_matches(original_text, '\d{1,2}\/\d{1,2}\/\d{2}', 'g')
FROM crime_reports;


SELECT crime_id,
regexp_match(original_text, '-\d{1,2}\/\d{1,2}\/\d{2}')
FROM crime_reports;

SELECT crime_id,
regexp_match(original_text, '\/\d{2}\n(\d{4})') AS hour
FROM crime_reports;

SELECT crime_id,
regexp_match(original_text, '\/\d{2}\n\d{4}-(\d{4})') AS second_hour
FROM crime_reports;

SELECT crime_id,
regexp_match(original_text, 'hrs.\n(\d+ .+(?:Sq.|Plz.|Dr.|Ter.|Rd.))') AS street
FROM crime_reports;

SELECT crime_id,
	regexp_match(original_text, '(?:Sq.|Plz.|Dr.|Ter.|Rd.)\n(\w+ \w+|\w+)\n') AS city
FROM crime_reports;

SELECT crime_id,
	regexp_match(original_text, '\n(?:\w+ \w+|\w+)\n(.*):') AS crime_type
FROM crime_reports;

SELECT crime_id,
	regexp_match(original_text, ':\s(.+)(?:C0|SO)') AS description
FROM crime_reports;

SELECT crime_id,
	regexp_match(original_text, '(?:C0|SO)[0-9]+') AS crime_type
FROM crime_reports;


SELECT
	regexp_match(original_text, '(?:C0|SO)[0-9]+') AS case_number,
	regexp_match(original_text, '\d{1,2}\/\d{1,2}\/\d{2}') AS date_1,
	regexp_match(original_text, '\n(?:\w+ \w+|\w+)\n(.*):') AS crime_type,
	regexp_match(original_text, '(?:Sq.|Plz.|Dr.|Ter.|Rd.)\n(\w+ \w+|\w+)\n') AS city
FROM crime_reports;

SELECT
	crime_id,
	(regexp_match(original_text, '(?:C0|SO)[0-9]+'))[1] AS case_number,
	(regexp_match(original_text, '\d{1,2}\/\d{1,2}\/\d{2}'))[1] AS date_1,
	(regexp_match(original_text, '\n(?:\w+ \w+|\w+)\n(.*):'))[1] AS crime_type,
	(regexp_match(original_text, '(?:Sq.|Plz.|Dr.|Ter.|Rd.)\n(\w+ \w+|\w+)\n'))[1] AS city
FROM crime_reports;

SHOW datestyle;

SET datestyle = 'ISO, MDY';
UPDATE crime_reports
SET date_1 =
(
	(regexp_match(original_text, '\d{1,2}\/\d{1,2}\/\d{2}'))[1]
	|| ' ' ||
	(regexp_match(original_text, '\/\d{2}\n(\d{4})'))[1]
	||' US/Eastern'
)::timestamptz;

SELECT crime_id,date_1 FROM crime_reports;


UPDATE crime_reports
SET date_1 =
	(
	(regexp_match(original_text, '\d{1,2}\/\d{1,2}\/\d{2}'))[1]
	|| ' ' ||
	(regexp_match(original_text, '\/\d{2}\n(\d{4})'))[1]
	||' US/Eastern'
	)::timestamptz,
	
date_2 =
CASE
	WHEN (SELECT regexp_match(original_text, '-(\d{1,2}\/\d{1,2}\/\d{1,2})') IS NULL)
		AND (SELECT regexp_match(original_text, '\/\d{2}\n\d{4}-(\d{4})') IS NOT NULL)
	THEN
		((regexp_match(original_text, '\d{1,2}\/\d{1,2}\/\d{2}'))[1]
			|| ' ' ||
		(regexp_match(original_text, '\/\d{2}\n\d{4}-(\d{4})'))[1]
			||' US/Eastern'
	)::timestamptz
WHEN (SELECT regexp_match(original_text, '-(\d{1,2}\/\d{1,2}\/\d{1,2})') IS NOT NULL)
		AND (SELECT regexp_match(original_text, '\/\d{2}\n\d{4}-(\d{4})') IS NOT NULL)
	THEN
		((regexp_match(original_text, '-(\d{1,2}\/\d{1,2}\/\d{1,2})'))[1]
			|| ' ' ||
		(regexp_match(original_text, '\/\d{2}\n\d{4}-(\d{4})'))[1]
			||' US/Eastern'
		)::timestamptz
		
	ELSE NULL
END,
street = (regexp_match(original_text, 'hrs.\n(\d+ .+(?:Sq.|Plz.|Dr.|Ter.|Rd.))'))[1],
city = (regexp_match(original_text, '(?:Sq.|Plz.|Dr.|Ter.|Rd.)\n(\w+ \w+|\w+)\n'))[1],
crime_type = (regexp_match(original_text, '\n(?:\w+ \w+|\w+)\n(.*):'))[1],
description = (regexp_match(original_text, ':\s(.+)(?:C0|SO)'))[1],
case_number = (regexp_match(original_text, '(?:C0|SO)[0-9]+'))[1];

SELECT geo_name
FROM us_counties_2010
WHERE geo_name ~* '(.+lade.+|.+lare.+)'
ORDER BY geo_name;

SELECT geo_name
FROM us_counties_2010
WHERE geo_name ~* '.+ash.+' --AND geo_name !~ 'Wash.+'
ORDER BY geo_name;


SELECT regexp_replace('05/12/2018', '\d{4}', '2017');
SELECT regexp_split_to_table('Four,score,and,seven,years,ago', ',');
SELECT regexp_split_to_array('Phil Mike Tony Steve', ',');

SELECT array_length(regexp_split_to_array('Phil Mike Tony Steve', ' '), 1);

SELECT to_tsvector('I am walking across the sitting room to sit with you.');

SELECT to_tsquery('walking & sitting');

SELECT to_tsvector('I am walking across the sitting room') @@ to_tsquery('walking & sitting');
SELECT to_tsvector('I am walking across the sitting room') @@ to_tsquery('walking & running');

CREATE TABLE president_speeches (
	sotu_id serial PRIMARY KEY,
	president varchar(100) NOT NULL,
	title varchar(250) NOT NULL,
	speech_date date NOT NULL,
	speech_text text NOT NULL,
	search_speech_text tsvector
);

COPY president_speeches (president, title, speech_date, speech_text)
FROM 'C:\Users\Mark\Documents\Bootcamp\1.SQL\postgresql\practical-sql-main\Chapter_13\sotu-1946-1977.csv'
WITH (FORMAT CSV, DELIMITER '|', HEADER OFF, QUOTE '@');

SELECT search_speech_text FROM president_speeches;

UPDATE president_speeches
SET search_speech_text = to_tsvector('english', speech_text);

CREATE INDEX search_idx ON president_speeches USING gin(search_speech_text);

SELECT president, speech_date
FROM president_speeches
WHERE search_speech_text @@ to_tsquery('Vietnam')
ORDER BY speech_date;

SELECT president, speech_date
FROM president_speeches
WHERE  speech_text LIKE '%Vietnam%'
ORDER BY speech_date;

SELECT president,
	speech_date,
	ts_headline(speech_text, to_tsquery('Vietnam'),
	'StartSel = <,
	StopSel = >,
	MinWords=5,
	MaxWords=7,
	MaxFragments=1')
FROM president_speeches
WHERE search_speech_text @@ to_tsquery('Vietnam');

SELECT president,
	speech_date,
	ts_headline(speech_text, to_tsquery('transportation & !roads'),
	'StartSel = <,
	StopSel = >,
	MinWords=5,
	MaxWords=7,
	MaxFragments=1')
FROM president_speeches
WHERE search_speech_text @@ to_tsquery('transportation & !roads');


SELECT president,
speech_date,
ts_rank(search_speech_text,
to_tsquery('war & security & threat & enemy')) AS score
FROM president_speeches
WHERE search_speech_text @@ to_tsquery('war & security & threat & enemy')
ORDER BY score DESC
LIMIT 5;

SELECT president,
speech_date,
ts_rank(search_speech_text,
to_tsquery('war & security & threat & enemy'), 2)::numeric
AS score
FROM president_speeches
WHERE search_speech_text @@ to_tsquery('war & security & threat & enemy')
ORDER BY score DESC
LIMIT 5;

-- Test Yourself #1 --
replace(author_name, ',', ' ');
regexp_replace(author_name, ',', ' ');

-- Test Yourself #2 --
regexp_split_to_table()

/*
SELECT
	(SELECT regexp_split_to_table(speech_text, '\s+') AS word
	FROM president_speeches)
FROM president_speeches
WHERE length(word) >= 5;

Column "word" does not exist
*/
-- Trying WITH statement to solve column word doesn't exist --

WITH words(word) AS
(
	SELECT regexp_split_to_table(speech_text, '\s+') AS word
	FROM president_speeches
)
SELECT
	regexp_replace(word, ',|:|.', ' '),
	count(word)
FROM words
WHERE length(word) >= 5;	

-- column "words.word" must appear in the GROUP BY clause or be used in an aggregate function --
WITH words(word) AS
(
	SELECT regexp_split_to_table(speech_text, '\s+') AS word
	FROM president_speeches
)
SELECT
	regexp_replace(word, ',|:|.', ' '),
	count(word)
FROM words
GROUP BY words.word
WHERE length(word) >= 5;

-- syntax error at or near "GROUP" LINE 11: GROUP BY words.word --
-- group must go at the end.... apparently
WITH words(word) AS
(
	SELECT regexp_split_to_table(speech_text, '\s+') AS word
	FROM president_speeches
)
SELECT
	regexp_replace(word, ',|:|.', ' ') AS word_no_punctuation,
	count(word)
FROM words
WHERE length(word) >= 5
GROUP BY word_no_punctuation
ORDER BY count(word) DESC;

-- Test Yourself #3 --
-- The score changed a lot...
SELECT president,
	speech_date,
	ts_rank_cd(search_speech_text,
	to_tsquery('war & security & threat & enemy')) AS score
FROM president_speeches
WHERE search_speech_text @@ to_tsquery('war & security & threat & enemy')
ORDER BY score DESC
LIMIT 5;




































SELECT * FROM crime_reports;






