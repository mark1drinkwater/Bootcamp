SELECT
date_part('year', '2019-12-01 18:37:12 EST'::timestamptz) AS "year",
date_part('month', '2019-12-01 18:37:12 EST'::timestamptz) AS "month",
date_part('day', '2019-12-01 18:37:12 EST'::timestamptz) AS "day",
date_part('hour', '2019-12-01 18:37:12 EST'::timestamptz) AS "hour",
date_part('minute', '2019-12-01 18:37:12 EST'::timestamptz) AS "minute",
date_part('seconds', '2019-12-01 18:37:12 EST'::timestamptz) AS "seconds",
date_part('timezone_hour', '2019-12-01 18:37:12 EST'::timestamptz) AS "tz",
date_part('week', '2019-12-01 18:37:12 EST'::timestamptz) AS "week",
date_part('quarter', '2019-12-01 18:37:12 EST'::timestamptz) AS "quarter",
date_part('epoch', '2019-12-01 18:37:12 EST'::timestamptz) AS "epoch";	
	
SELECT make_date(2018, 2, 22);
SELECT make_time(18, 4, 30.3);
SELECT make_timestamptz(2018, 2, 22, 18, 4, 30.3, 'Europe/Lisbon');	
	
CREATE TABLE current_time_example (
	time_id bigserial,
	current_timestamp_col timestamp with time zone,
	clock_timestamp_col timestamp with time zone
);

INSERT INTO current_time_example (current_timestamp_col, clock_timestamp_col) (SELECT current_timestamp,clock_timestamp()
FROM generate_series(1,1000000));

DROP TABLE current_time_example;

SELECT MAX(clock_timestamp_col) - MIN(clock_timestamp_col) FROM current_time_example;

SELECT * FROM pg_timezone_abbrevs;
SELECT * FROM pg_timezone_names;

SELECT * FROM pg_timezone_names
WHERE name LIKE 'Europe%';

SHOW timezone;

SET timezone TO 'US/Pacific';

CREATE TABLE time_zone_test (
test_date timestamp with time zone
);

INSERT INTO time_zone_test VALUES ('2020-01-01 4:00');

SELECT test_date
FROM time_zone_test;

SET timezone TO 'US/Eastern';

SELECT test_date
FROM time_zone_test;

SELECT test_date AT TIME ZONE 'Asia/Seoul'
FROM time_zone_test;

SELECT '1929/09/30'::date - '1929/09/27'::date;

SELECT '1929/09/30'::date + '5 years'::interval;

--- New York Taxi ---
CREATE TABLE nyc_yellow_taxi_trips_2016_06_01 (
trip_id bigserial PRIMARY KEY,
vendor_id varchar(1) NOT NULL,
tpep_pickup_datetime timestamp with time zone NOT NULL,
tpep_dropoff_datetime timestamp with time zone NOT NULL,
passenger_count integer NOT NULL,
trip_distance numeric(8,2) NOT NULL,
pickup_longitude numeric(18,15) NOT NULL,
pickup_latitude numeric(18,15) NOT NULL,
rate_code_id varchar(2) NOT NULL,
store_and_fwd_flag varchar(1) NOT NULL,
dropoff_longitude numeric(18,15) NOT NULL,
dropoff_latitude numeric(18,15) NOT NULL,
payment_type varchar(1) NOT NULL,
fare_amount numeric(9,2) NOT NULL,
extra numeric(9,2) NOT NULL,
mta_tax numeric(5,2) NOT NULL,
tip_amount numeric(9,2) NOT NULL,
tolls_amount numeric(9,2) NOT NULL,
improvement_surcharge numeric(9,2) NOT NULL,
total_amount numeric(9,2) NOT NULL
);

 COPY nyc_yellow_taxi_trips_2016_06_01 (
vendor_id,
tpep_pickup_datetime,
tpep_dropoff_datetime,
passenger_count,
trip_distance,
pickup_longitude,
pickup_latitude,
rate_code_id,
store_and_fwd_flag,
dropoff_longitude,
dropoff_latitude,
payment_type,
fare_amount,
extra,
mta_tax,
tip_amount,
tolls_amount,
improvement_surcharge,
total_amount
)
FROM 'C:\Users\Mark\Desktop\postrgesql\practical-sql-main\Chapter_11\yellow_tripdata_2016_06_01.csv'
WITH (FORMAT CSV, HEADER, DELIMITER ',');

CREATE INDEX tpep_pickup_idx
ON nyc_yellow_taxi_trips_2016_06_01 (tpep_pickup_datetime);

SELECT count(*) FROM nyc_yellow_taxi_trips_2016_06_01;

SET timezone TO 'US/Eastern';

SELECT
date_part('hour', tpep_pickup_datetime) AS trip_hour,
count(*)
FROM nyc_yellow_taxi_trips_2016_06_01
GROUP BY trip_hour
ORDER BY COUNT(*) DESC;

COPY
	(SELECT
	date_part('hour', tpep_pickup_datetime) AS trip_hour,
	count(*)
	FROM nyc_yellow_taxi_trips_2016_06_01
	GROUP BY trip_hour
	ORDER BY trip_hour
)
TO 'C:\Users\Mark\Desktop\postrgesql\hourly_pickups_2016_06_01.csv'
WITH (FORMAT CSV, HEADER, DELIMITER ',');

SELECT
	date_part('hour', tpep_pickup_datetime) AS trip_hour,
	percentile_cont(.5) WITHIN GROUP (ORDER BY tpep_dropoff_datetime - tpep_pickup_datetime) AS median_trip
FROM nyc_yellow_taxi_trips_2016_06_01
GROUP BY trip_hour
ORDER BY median_trip;



SET timezone TO 'US/Central';

CREATE TABLE train_rides (
trip_id bigserial PRIMARY KEY,
segment varchar(50) NOT NULL,
departure timestamp with time zone NOT NULL,
arrival timestamp with time zone NOT NULL
);

INSERT INTO train_rides (segment, departure, arrival)
VALUES
	('Chicago to New York', '2017-11-13 21:30 CST', '2017-11-14 18:23 EST'),
	('New York to New Orleans', '2017-11-15 14:15 EST', '2017-11-16 19:32 CST'),
	('New Orleans to Los Angeles', '2017-11-17 13:45 CST', '2017-11-18 9:00 PST'),
	('Los Angeles to San Francisco', '2017-11-19 10:10 PST', '2017-11-19 21:24 PST'),
	('San Francisco to Denver', '2017-11-20 9:10 PST', '2017-11-21 18:38 MST'),
	('Denver to Chicago', '2017-11-22 19:10 MST', '2017-11-23 14:50 CST');
	
SELECT * FROM train_rides;

SELECT segment,
to_char(departure, 'YYYY-MM-DD HH12:MI a.m. TZ') AS departure,
arrival - departure AS segment_time
FROM train_rides;


SELECT segment,
	arrival - departure AS segment_time,
	sum(arrival - departure) OVER (ORDER BY trip_id) AS cume_time
FROM train_rides;

SELECT segment,
	arrival - departure AS segment_time,
	sum(date_part('epoch', (arrival - departure))) OVER (ORDER BY trip_id) * interval '1 second' AS cume_time
FROM train_rides;

-- Test Yourself #1 --
-- Quite a few records have 0 or a few seconds duration which doesn't make sense.
-- Two records say the dropoff time took place before the pickup time (talk about time travel).
-- Some rides are close to 24 hours....
SELECT trip_id,
	tpep_dropoff_datetime - tpep_pickup_datetime AS length_trip
FROM nyc_yellow_taxi_trips_2016_06_01	
ORDER BY length_trip DESC;

-- Test Yourself #2 --
SELECT * FROM pg_timezone_names
WHERE name LIKE '%Melbourne%';

SET timezone TO 'US/Central';

/*SELECT 
	to_char('1 January 2100'::timestamptz, 'YYYY-MM-DD HH:MI US/Central') AS New_York_time,
	to_char('1 January 2100'::timestamptz, 'YYYY-MM-DD HH:MI Europe/London') AS London_time,
	to_char('1 January 2100'::timestamptz, 'YYYY-MM-DD HH:MI Africa/Johannesburg') AS Johannesburg_time,
	to_char('1 January 2100'::timestamptz, 'YYYY-MM-DD HH:MI Europe/Moscow') AS Moscow_time,
	to_char('1 January 2100'::timestamptz, 'YYYY-MM-DD HH:MI Australia/Melbourne') AS Melbourne_time;*/	

SELECT
	'2100-01-01 00:00:00' AT TIME ZONE 'US/Central' AS new_york_time,
	'2100-01-01 00:00:00' AT TIME ZONE 'Europe/London' AS london_time,
	'2100-01-01 00:00:00' AT TIME ZONE 'Africa/Johannesburg' AS johannesburg_time,
	'2100-01-01 00:00:00' AT TIME ZONE 'Europe/Moscow' AS moscow_time,
	'2100-01-01 00:00:00' AT TIME ZONE 'Australia/Melbourne' AS melbourne_time;
	

-- Test Yourself #3 --
SELECT 
	corr(total_amount, date_part('epoch', tpep_dropoff_datetime - tpep_pickup_datetime) ),
	regr_r2(total_amount, date_part('epoch', tpep_dropoff_datetime - tpep_pickup_datetime) ),
	
	corr(total_amount, trip_distance),
	regr_r2(total_amount, trip_distance)
FROM nyc_yellow_taxi_trips_2016_06_01
WHERE tpep_dropoff_datetime - tpep_pickup_datetime <= '3 hours'::interval;





