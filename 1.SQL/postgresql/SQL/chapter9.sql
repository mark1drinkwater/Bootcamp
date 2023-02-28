CREATE TABLE meat_poultry_egg_inspect (
est_number varchar(50) CONSTRAINT est_number_key PRIMARY KEY,
company varchar(100),
street varchar(100),
city varchar(30),
st varchar(2),
zip varchar(5),
phone varchar(14),
grant_date date,
activities text,
dbas text
);

COPY meat_poultry_egg_inspect
FROM 'C:\Users\Mark\Desktop\postrgesql\practical-sql-main\Chapter_09\MPI_Directory_by_Establishment_Name.csv'
WITH (FORMAT CSV, HEADER, DELIMITER ',');

CREATE INDEX company_idx ON meat_poultry_egg_inspect (company);

SELECT * FROM meat_poultry_egg_inspect;

SELECT company,
st,
city,
street,
count(*) AS address_count
FROM meat_poultry_egg_inspect
GROUP BY company, st, street, city
HAVING count(*) > 1
ORDER BY company, street, city, st;

SELECT st,
count(*) AS st_count
FROM meat_poultry_egg_inspect
GROUP BY st
ORDER BY st;

SELECT est_number,
company,
city,
st,
zip
FROM meat_poultry_egg_inspect
WHERE st IS NULL
ORDER BY st NULLS FIRST;

SELECT company,
count(*) AS company_count
FROM meat_poultry_egg_inspect
GROUP BY company
ORDER BY company ASC;

SELECT length(zip),
count(*) AS length_count
FROM meat_poultry_egg_inspect
GROUP BY length(zip)
ORDER BY length(zip) ASC;

SELECT st,
count(*) AS st_count
FROM meat_poultry_egg_inspect
WHERE length(zip) < 5
GROUP BY st
ORDER BY st ASC;

CREATE TABLE meat_poultry_egg_inspect_backup AS
SELECT * FROM meat_poultry_egg_inspect;

SELECT
(SELECT count(*) FROM meat_poultry_egg_inspect) AS original,
(SELECT count(*) FROM meat_poultry_egg_inspect_backup) AS backup;

ALTER TABLE meat_poultry_egg_inspect ADD COLUMN st_copy varchar(2);

SELECT * FROM meat_poultry_egg_inspect;

UPDATE meat_poultry_egg_inspect
SET st_copy = st;

SELECT st,
st_copy
FROM meat_poultry_egg_inspect
ORDER BY st;

UPDATE meat_poultry_egg_inspect
SET st = 'MN'
WHERE est_number = 'V18677A';

UPDATE meat_poultry_egg_inspect
SET st = 'AL'
WHERE est_number = 'M45319+P45319';

UPDATE meat_poultry_egg_inspect
SET st = 'WI'
WHERE est_number = 'M263A+P263A+V263A';

-- Restore from state backup column --
UPDATE meat_poultry_egg_inspect
SET st = st_copy;

-- Restore from backup table --
UPDATE meat_poultry_egg_inspect original
SET st = backup.st
FROM meat_poultry_egg_inspect_backup backup
WHERE original.est_number = backup.est_number;

-- Add company backup column --
ALTER TABLE meat_poultry_egg_inspect ADD COLUMN company_standard varchar(100);

-- Set backup company column equal to original company column
UPDATE meat_poultry_egg_inspect
SET company_standard = company;

-- Find companies that contain the name Armour --
SELECT company, company_standard
FROM meat_poultry_egg_inspect
WHERE company LIKE 'Armour%';

-- Set all companies that contain the name Amour to Armour-Eckrich Meats --
-- In order to standardise the names --
UPDATE meat_poultry_egg_inspect
SET company = 'Armour-Eckrich Meats'
WHERE company LIKE 'Armour%';

-- Drop company backup column --
ALTER TABLE meat_poultry_egg_inspect DROP COLUMN company_standard;

-- Make a backup column of zip codes --
ALTER TABLE meat_poultry_egg_inspect ADD COLUMN zip_copy varchar(5);

UPDATE meat_poultry_egg_inspect
SET zip_copy = zip;


SELECT LENGTH(zip)
FROM meat_poultry_egg_inspect
WHERE LENGTH(zip) < 5
GROUP BY LENGTH(zip);

UPDATE meat_poultry_egg_inspect
SET zip = '00' || zip
WHERE st IN('PR','VI') AND length(zip) = 3;

UPDATE meat_poultry_egg_inspect
SET zip = '0' || zip
WHERE st IN('CT','MA','ME','NH','NJ','RI','VT') AND length(zip) = 4;

CREATE TABLE state_regions (
st varchar(2) CONSTRAINT st_key PRIMARY KEY,
region varchar(20) NOT NULL
);

COPY state_regions
FROM 'C:\Users\Mark\Desktop\postrgesql\practical-sql-main\Chapter_09\state_regions.csv'
WITH (FORMAT CSV, HEADER, DELIMITER ',');

ALTER TABLE meat_poultry_egg_inspect ADD COLUMN inspection_date date;

-- This is basically what the below below subquery does --
-- It joins the tables on the matching rows and that is what sql updates
SELECT DISTINCT state_regions.st, state_regions.region FROM
meat_poultry_egg_inspect inspect
JOIN state_regions
ON inspect.st=state_regions.st
WHERE state_regions.region = 'New England'

UPDATE meat_poultry_egg_inspect inspect
SET inspection_date = '2019-12-01'
WHERE EXISTS (
	SELECT state_regions.region
	FROM state_regions
	WHERE inspect.st = state_regions.st
	AND state_regions.region = 'New England'
);

SELECT DISTINCT st FROM meat_poultry_egg_inspect
WHERE inspection_date = '2019-12-01';

-- Delete all records in these 2 states --
DELETE FROM meat_poultry_egg_inspect
WHERE st IN('PR','VI');

-- Transaction Block --
START TRANSACTION;

UPDATE meat_poultry_egg_inspect
SET company = 'AGRO Merchants Oakland LLC'
WHERE company = 'AGRO Merchants Oakland, LLC';

SELECT company
FROM meat_poultry_egg_inspect
WHERE company LIKE 'AGRO%'
ORDER BY company;

ROLLBACK;

COMMIT;

-- Create new table --
DROP TABLE meat_poultry_egg_inspect_backup;

CREATE TABLE meat_poultry_egg_inspect_backup AS
SELECT *,
'2018-02-07'::date AS reviewed_date
FROM meat_poultry_egg_inspect;

ALTER TABLE meat_poultry_egg_inspect RENAME TO meat_poultry_egg_inspect_temp;

ALTER TABLE meat_poultry_egg_inspect_backup RENAME TO meat_poultry_egg_inspect;

ALTER TABLE meat_poultry_egg_inspect_temp RENAME TO meat_poultry_egg_inspect_backup;

-- Test Yourself #1 --
ALTER TABLE meat_poultry_egg_inspect ADD COLUMN meat_processing boolean;
ALTER TABLE meat_poultry_egg_inspect ADD COLUMN poultry_processing boolean;

SELECT activities,meat_processing, poultry_processing FROM meat_poultry_egg_inspect;

-- Test Yourself #2 --
UPDATE meat_poultry_egg_inspect
SET meat_processing = true
WHERE activities LIKE '%Meat Processing%';

UPDATE meat_poultry_egg_inspect
SET poultry_processing = true
WHERE activities LIKE '%Poultry Processing%';

SELECT activities, meat_processing, poultry_processing 
FROM meat_poultry_egg_inspect
ORDER BY meat_processing, poultry_processing;

SELECT activities, meat_processing, poultry_processing 
FROM meat_poultry_egg_inspect
WHERE poultry_processing=false OR meat_processing=false;

-- Test Yourself #3 --
-- Meat Processing --
SELECT 
	COUNT(meat_processing) AS meat_processing_count
FROM meat_poultry_egg_inspect
WHERE meat_processing=true;
-- Note:   =true is not required.

-- Poultry Processing --
SELECT
	COUNT(poultry_processing) AS poultry_processing_count
FROM meat_poultry_egg_inspect
WHERE poultry_processing=true;

-- Meat and Poultry Processing --
SELECT 
	COUNT(meat_processing) AS meat_and_pultry_processing_count
FROM meat_poultry_egg_inspect
WHERE meat_processing=true AND poultry_processing=true;

-- Using subqueries to display in a single query.
SELECT
	(SELECT COUNT(meat_processing) FROM meat_poultry_egg_inspect WHERE meat_processing) AS meat_processing_count,
	(SELECT	COUNT(poultry_processing) FROM meat_poultry_egg_inspect WHERE poultry_processing) AS poultry_processing_count,
	(SELECT COUNT(meat_processing) FROM meat_poultry_egg_inspect WHERE meat_processing AND poultry_processing) AS meat_and_pultry_processing_count
FROM meat_poultry_egg_inspect
LIMIT 1;














