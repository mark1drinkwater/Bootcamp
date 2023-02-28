SELECT 2 + 2;
SELECT 9 - 1;
SELECT 3 * 4;

SELECT 11 / 6;
SELECT 11 % 6;58 Chapter 5
SELECT 11.0 / 6;
SELECT CAST (11 AS numeric(3,1)) / 6;

SELECT 3 ^ 4;
SELECT |/ 10;
SELECT sqrt(10);
SELECT ||/ 10;
SELECT 4 !;

SELECT 7 + 8 * 9;
SELECT (7 + 8) * 9;

SELECT 3 ^ 3 - 1;
SELECT 3 ^ (3 - 1);

SELECT geo_name,
	state_us_abbreviation AS "st",
	p0010001 AS "Total Population",
	p0010003 AS "White Alone",
	p0010004 AS "Black or African American Alone",
	p0010005 AS "Am Indian/Alaska Native Alone",
	p0010006 AS "Asian Alone",
	p0010007 AS "Native Hawaiian and Other Pacific Islander Alone",
	p0010008 AS "Some Other Race Alone",
	p0010009 AS "Two or More Races"
FROM us_counties_2010;

COPY (
	SELECT geo_name,
	state_us_abbreviation AS "st",
	p0010003 AS "White Alone",
	p0010004 AS "Black Alone",
	p0010003 + p0010004 AS "Total White and Black"
	FROM us_counties_2010
)
TO 'C:\Users\Mark\Desktop\postrgesql\census.txt'
WITH (FORMAT CSV, HEADER, DELIMITER '|');

SELECT geo_name,
	state_us_abbreviation AS "st",
	p0010001 AS "Total",
	p0010003 + p0010004 + p0010005 + p0010006 + p0010007
	+ p0010008 + p0010009 AS "All Races",
	(p0010003 + p0010004 + p0010005 + p0010006 + p0010007
	+ p0010008 + p0010009) - p0010001 AS "Difference"
FROM us_counties_2010
ORDER BY "Difference" DESC;

SELECT geo_name,
	state_us_abbreviation AS "st",
	p0010001 AS "Total",
	p0010003 + p0010004 + p0010005 + p0010006 + p0010007
	+ p0010008 + p0010009 AS "All Races",
	(p0010003 + p0010004 + p0010005 + p0010006 + p0010007+
	p0010008 + p0010009) - p0010001 AS "Difference"
FROM us_counties_2010
ORDER BY "Difference" DESC;

SELECT geo_name,
state_us_abbreviation AS "st",
CAST((1.0 * p0010006 / p0010001 * 100) AS numeric(8,1)) AS "pct_asian"
FROM us_counties_2010
ORDER BY "pct_asian" DESC;

CREATE TABLE percent_change (
department varchar(20),
spend_2014 numeric(10,2),
spend_2017 numeric(10,2)
);

INSERT INTO percent_change
VALUES
('Building', 250000, 289000),
('Assessor', 178556, 179500),
('Library', 87777, 90001),
('Clerk', 451980, 650000),
('Police', 250000, 223000),
('Recreation', 199000, 195000);

SELECT department,
spend_2014,
spend_2017,
round( (spend_2017 - spend_2014) / spend_2014 * 100, 1) AS "pct_change"
FROM percent_change;

SELECT sum(p0010001) AS "County Sum",
round(avg(p0010001), 0) AS "County Average"
FROM us_counties_2010;

CREATE TABLE percentile_test (
numbers integer
);

INSERT INTO percentile_test (numbers) VALUES
(1), (2), (3), (4), (5), (6);

SELECT ROUND(AVG(numbers),1),
percentile_cont(.5) WITHIN GROUP (ORDER BY numbers),
percentile_disc(.5) WITHIN GROUP (ORDER BY numbers)
FROM percentile_test;

SELECT sum(p0010001) AS "County Sum",
round(avg(p0010001), 0) AS "County Average",
percentile_cont(.5)
WITHIN GROUP (ORDER BY p0010001) AS "County Median"
FROM us_counties_2010;

SELECT unnest(
	percentile_cont(array[.25,.5,.75, 1])
	WITHIN GROUP (ORDER BY p0010001)) AS "quartiles"
FROM us_counties_2010;

CREATE OR REPLACE FUNCTION _final_median(anyarray)
RETURNS float8 AS
$$
WITH q AS
(
SELECT val
FROM unnest($1) val
WHERE VAL IS NOT NULL
ORDER BY 1
),
cnt AS
(
SELECT COUNT(*) AS c FROM q
)
SELECT AVG(val)::float8
FROM
(
SELECT val FROM q
LIMIT 2 - MOD((SELECT c FROM cnt), 2)
OFFSET GREATEST(CEIL((SELECT c FROM cnt) / 2.0) - 1,0)
) q2;
$$
LANGUAGE sql IMMUTABLE;

CREATE AGGREGATE median(anyelement) (
SFUNC=array_append,
STYPE=anyarray,
FINALFUNC=_final_median,
INITCOND='{}'
);

SELECT sum(p0010001) AS "County Sum",
round(AVG(p0010001), 0) AS "County Average",
median(p0010001) AS "County Median",
percentile_cont(.5)
WITHIN GROUP (ORDER BY p0010001) AS "50th Percentile"
FROM us_counties_2010;

SELECT mode() WITHIN GROUP (ORDER BY p0010001)
FROM us_counties_2010;

-- Test Yourself #1 --
SELECT PI() * 5^2 AS area_of_circle;
--Parantheses/Brackets just needed to call the PI function.

-- Test Yourself #2 --
SELECT geo_name, (1.0*p0010005/p0010001*100) AS percentage_american_indian_alaska_native_alone
FROM us_counties_2010
WHERE state_us_abbreviation='NY'
ORDER BY percentage_american_indian_alaska_native_alone DESC
LIMIT 1;

/*
    Historical context: The area now known as Franklin County has a long history of Native American habitation, 
	with several Native American tribes calling the area home for centuries before European settlement. 
	Some of these tribes, including the Mohawk and the St. Regis Mohawk, continue to have a presence in the county today.

    Tribal sovereignty: The St. Regis Mohawk Reservation, which spans parts of Franklin County and neighboring St. Lawrence County,
	is a federally recognized Indian reservation with a sovereign government. This has led to a significant Native American population in the area.

    Economic opportunities: The St. Regis Mohawk Reservation has created economic opportunities for its residents through the development of businesses
	such as casinos and manufacturing facilities. This has drawn Native Americans from other areas to the reservation and nearby communities, increasing
	the overall proportion of American Indian population in the county.

    Cultural attractions: The Franklin County area also has several cultural attractions related to Native American history and heritage, 
	including the Akwesasne Cultural Center and the Six Nations Indian Museum, which may draw visitors and residents interested in Native American culture.
*/	

-- Test Yourself #3
-- California.

SELECT 
percentile_cont(.5) WITHIN GROUP (ORDER BY population_count_100_percent) AS "new_york_median_percentage"
FROM us_counties_2010
WHERE state_us_abbreviation='NY';

SELECT 
percentile_cont(.5) WITHIN GROUP (ORDER BY population_count_100_percent) AS "california_median_percentage"
FROM us_counties_2010
WHERE state_us_abbreviation='CA';

-- 2nd Method --
SELECT 
percentile_cont(.5) WITHIN GROUP (ORDER BY population_count_100_percent) AS "new_york_median_percentage"
FROM us_counties_2010
WHERE state_us_abbreviation IN ('NY', 'CA')
GROUP BY state_us_abbreviation;