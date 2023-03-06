-------------------------- EASY Questions --------------------------

-- Show first name, last name, and gender of patients who's gender is 'M'
SELECT first_name, last_name, gender
FROM patients
WHERE gender='M';

-- Show first name and last name of patients who does not have allergies. (null)
SELECT first_name, last_name
FROM patients
WHERE allergies IS NULL;

-- Show first name of patients that start with the letter 'C'
SELECT first_name FROM patients
WHERE first_name LIKE 'C%';

-- Show first name and last name of patients that weight within the range of 100 to 120 (inclusive)
SELECT first_name, last_name FROM patients
WHERE weight between 100 AND 120;

-- Update the patients table for the allergies column. If the patient's allergies is null then replace it with 'NKA'
UPDATE patients
SET allergies='NKA'
WHERE allergies IS NULL;

-- Show first name and last name concatinated into one column to show their full name.
SELECT concat(first_name,' ',last_name)
FROM patients;

-- Show first name, last name, and the full province name of each patient.
-- Example: 'Ontario' instead of 'ON'
SELECT first_name, last_name, province_names.province_name
FROM patients
JOIN province_names
ON (province_names.province_id=patients.province_id);

-- Show how many patients have a birth_date with 2010 as the birth year.
SELECT COUNT(*) FROM patients
WHERE YEAR(birth_date) = 2010;

-- Show the first_name, last_name, and height of the patient with the greatest height.
SELECT first_name, last_name, MAX(height)
FROM patients;

-- Show all columns for patients who have one of the following patient_ids: 1,45,534,879,1000
SELECT * FROM patients
WHERE patient_id IN (1,45,534,879,1000);

-- Show the total number of admissions
SELECT count(*) FROM admissions;

-- Show all the columns from admissions where the patient was admitted and discharged on the same day.
SELECT * FROM admissions
WHERE admission_date=discharge_date;

-- Show the patient id and the total number of admissions for patient_id 579.
SELECT patient_id, COUNT(patient_id)
FROM admissions
WHERE patient_id='579';

-- Based on the cities that our patients live in, show unique cities that are in province_id 'NS'?
SELECT DISTINCT city FROM patients
WHERE province_id='NS';

-- Write a query to find the first_name, last name and birth date of patients who has height greater than 160 and weight greater than 70
SELECT first_name, last_name, birth_date FROM patients
WHERE height > 160 AND weight > 70;

-- Write a query to find list of patients first_name, last_name, and allergies from Hamilton where allergies are not null
SELECT first_name, last_name, allergies
FROM patients
WHERE city='Hamilton' AND allergies IS NOT NULL;

-- Based on cities where our patient lives in, write a query to display the list of unique city starting with a vowel (a, e, i, o, u). 
-- Show the result order in ascending by city.
SELECT DISTINCT city
FROM patients
WHERE city LIKE 'a%' OR city LIKE 'e%' OR city LIKE 'i%' OR city LIKE 'o%' OR city LIKE 'u%'
ORDER BY city;




















