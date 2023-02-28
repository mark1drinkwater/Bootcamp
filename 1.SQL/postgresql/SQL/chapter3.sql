CREATE TABLE char_data_types (
	varchar_column varchar(10),
	char_column char(10),
	text_column text
);

INSERT INTO char_data_types
VALUES
('abc', 'abc', 'abc'),
('defghi', 'defghi', 'defghi');

SELECT * FROM char_data_types;

COPY char_data_types TO 'C:\Users\Mark\Desktop\postrgesql\char_data.txt'
WITH (FORMAT CSV, HEADER, DELIMITER '|');

CREATE TABLE number_data_types (
	numeric_column numeric(20,5),
	real_column real,
	double_column double precision
);

INSERT INTO number_data_types
VALUES
	(.7, .7, .7),
	(2.13579, 2.13579, 2.13579),
	(2.1357987654, 2.1357987654, 2.1357987654);

SELECT * FROM number_data_types;


SELECT
numeric_column * 10000000 AS "Fixed",
real_column * 10000000 AS "Float",
double_column * 10000000 AS "FloatD"
FROM number_data_types;

CREATE TABLE date_time_types (
timestamp_column timestamp with time zone,
interval_column interval
);

INSERT INTO date_time_types
VALUES
('2018-12-31 01:00 EST','2 days'),
('2018-12-31 01:00 -8','1 month'),
('2018-12-31 01:00 Australia/Melbourne','1 century'),
(now(),'1 week');

SELECT * FROM date_time_types;

SELECT
timestamp_column,
interval_column,
timestamp_column - interval_column AS new_date
FROM date_time_types;

SELECT timestamp_column, CAST(timestamp_column AS varchar(10))
FROM date_time_types;

SELECT numeric_column,
CAST(numeric_column AS integer) AS one,
CAST(numeric_column AS varchar(6)) AS two
FROM number_data_types;

SELECT * FROM char_data_types;
SELECT CAST(char_column AS integer) FROM char_data_types;

SELECT real_column, CAST(real_column AS integer) FROM number_data_types;

-- Try it Yourself #1 --
--999.9 is the maximum value
-- numeric(4,1)

-- Try it Yourself #2 --
/*
	varchar(40)
	When you store it as a single full name then you are losing information on what is their first name and surname.
	It will be difficult/impossible to separate their name and surname if you combine it in a single column.
*/

-- Try it Yourself #3 --
/*
	You will receive an error, because it is missing the month.
*/



















