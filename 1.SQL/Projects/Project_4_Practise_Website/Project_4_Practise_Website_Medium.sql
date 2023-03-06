-------------------------- MEDIUM Questions --------------------------

-- Show unique birth years from patients and order them by ascending.
SELECT DISTINCT YEAR(birth_date)
FROM patients
ORDER BY YEAR(birth_date);

-- Show unique first names from the patients table which only occurs once in the list.
-- For example, if two or more people are named 'John' in the first_name column then don't include their name in the output list.
-- If only 1 person is named 'Leo' then include them in the output.
SELECT first_name
FROM patients
GROUP BY first_name
HAVING COUNT(first_name) = 1;

-- Show patient_id and first_name from patients where their first_name start and ends with 's' and is at least 6 characters long.
SELECT patient_id, first_name
FROM patients
WHERE first_name LIKE '%s' AND first_name LIKE 's%' AND LEN(first_name) >= 6;

-- Show patient_id, first_name, last_name from patients whos diagnosis is 'Dementia'.
-- Primary diagnosis is stored in the admissions table.
SELECT patients.patient_id, first_name, last_name
FROM patients
JOIN admissions
ON patients.patient_id=admissions.patient_id
WHERE admissions.diagnosis='Dementia';

-- Display every patient's first_name.
-- Order the list by the length of each name and then by alphbetically
SELECT patients.first_name
FROM patients
ORDER BY LEN(patients.first_name), first_name;

-- Show the total amount of male patients and the total amount of female patients in the patients table.
-- Display the two results in the same row.
SELECT
  (SELECT COUNT(*) FROM patients WHERE gender='M'),
  (SELECT COUNT(*) FROM patients WHERE gender='F')
FROM patients
LIMIT 1;

-- Show first and last name, allergies from patients which have allergies to either 'Penicillin' or 'Morphine'. 
-- Show results ordered ascending by allergies then by first_name then by last_name.
SELECT first_name, last_name, allergies
FROM patients
WHERE allergies='Penicillin' or allergies='Morphine'
ORDER BY allergies, first_name, last_name;

-- Show patient_id, diagnosis from admissions. Find patients admitted multiple times for the same diagnosis.
SELECT patient_id, diagnosis
FROM admissions
GROUP BY patient_id, diagnosis
HAVING COUNT(diagnosis)>1;

-- Show the city and the total number of patients in the city.
-- Order from most to least patients and then by city name ascending.
SELECT city, COUNT(patient_id)
FROM patients
GROUP BY city
ORDER BY COUNT(patient_id) DESC, city ASC;

-- Show first name, last name and role of every person that is either patient or doctor.
-- The roles are either "Patient" or "Doctor"
SELECT first_name, last_name, 'Patient' AS role FROM patients
  UNION ALL
SELECT first_name, last_name, 'Doctor' AS role FROM doctors;

-- Show all allergies ordered by popularity. Remove NULL values from query.
SELECT allergies, COUNT(allergies) FROM patients
WHERE allergies IS NOT null
GROUP BY allergies
ORDER BY COUNT(allergies) DESC;

-- Show all patient's first_name, last_name, and birth_date who were born in the 1970s decade. 
-- Sort the list starting from the earliest birth_date.
SELECT first_name, last_name, birth_date FROM patients
WHERE YEAR(birth_date) BETWEEN 1970 AND 1979
ORDER BY birth_date ASC;

-- We want to display each patient's full name in a single column. 
-- Their last_name in all upper letters must appear first, then first_name in all lower case letters. 
-- Separate the last_name and first_name with a comma. Order the list by the first_name in decending order
--EX: SMITH,jane
SELECT concat(UPPER(last_name),',',LOWER(first_name)) AS new_name_format 
FROM patients
ORDER BY first_name DESC;

-- Show the province_id(s), sum of height; where the total sum of its patient's height is greater than or equal to 7,000.
SELECT province_id, SUM(height) AS sum_height
FROM patients
GROUP BY province_id
HAVING sum_height >= 7000;

-- Show the difference between the largest weight and smallest weight for patients with the last name 'Maroni'
SELECT MAX(weight)-MIN(weight) AS weight_delta
FROM patients
WHERE last_name='Maroni';

-- Show all of the days of the month (1-31) and how many admission_dates occurred on that day. 
-- Sort by the day with most admissions to least admissions.
SELECT DAY(admission_date) AS day_number, COUNT(patient_id) AS number_of_admissions
FROM admissions
GROUP BY day_number
ORDER BY number_of_admissions DESC;

-- Show all columns for patient_id 542's most recent admission_date.
SELECT patients.patient_id, admission_date, discharge_date, diagnosis, attending_doctor_id
FROM patients
JOIN admissions
ON patients.patient_id=admissions.patient_id
WHERE patients.patient_id='542'
ORDER BY admission_date DESC
LIMIT 1;

-- Show patient_id, attending_doctor_id, and diagnosis for admissions that match one of the two criteria:
-- 1. patient_id is an odd number and attending_doctor_id is either 1, 5, or 19.
-- SELECT 2. attending_doctor_id contains a 2 and the length of patient_id is 3 characters.
SELECT admissions.patient_id, admissions.attending_doctor_id, admissions.diagnosis
FROM admissions
WHERE (MOD(patient_id,2)=1 AND attending_doctor_id IN (1,5,19)) OR
        (attending_doctor_id LIKE '%2%' AND LEN(patient_id)=3);

-- Show first_name, last_name, and the total number of admissions attended for each doctor.
-- Every admission has been attended by a doctor.
SELECT first_name, last_name, COUNT(*) AS number_of_admissions
FROM admissions
JOIN doctors
ON admissions.attending_doctor_id=doctors.doctor_id
GROUP BY attending_doctor_id;

-- For each doctor, display their id, full name, and the first and last admission date they attended.
SELECT 
	doctor_id,
    concat(first_name,' ',last_name) AS full_name,
    MIN(admission_date),
    MAX(admission_date)
FROM doctors
JOIN admissions
ON doctors.doctor_id=admissions.attending_doctor_id
GROUP BY doctor_id;

-- Display the total amount of patients for each province. Order by descending.
SELECT province_name, COUNT(patient_id) AS patient_count
FROM patients
JOIN province_names
ON patients.province_id=province_names.province_id
GROUP BY province_names.province_name
ORDER BY patient_count DESC;

-- For every admission, display the patient's full name, their admission diagnosis, and their doctor's full name who diagnosed their problem.
SELECT 
	concat(patients.first_name,' ',patients.last_name) AS patient_full_name,
    diagnosis, 
    CONCAT(doctors.first_name,' ',doctors.last_name) AS doctor_full_name
FROM doctors
JOIN admissions 
  ON doctors.doctor_id=admissions.attending_doctor_id
JOIN patients
  ON patients.patient_id=admissions.patient_id;
  
-- display the number of duplicate patients based on their first_name and last_name.  
SELECT first_name, last_name,
  COUNT(concat(first_name,' ', last_name)) AS full_name_count
FROM patients
GROUP BY concat(first_name,' ', last_name)
HAVING full_name_count > 1
ORDER BY first_name;

-- Display patient's full name,
-- height in the units feet rounded to 1 decimal,
-- weight in the unit pounds rounded to 0 decimals,
-- birth_date,
-- gender non abbreviated.
-- Convert CM to feet by dividing by 30.48.
-- Convert KG to pounds by multiplying by 2.205.

SELECT 
	concat(first_name,' ', last_name) AS full_name,
    ROUND(height/30.48,1),
    ROUND(weight*2.205),
    birth_date,
    CASE 
    	WHEN gender='M' 
        THEN 'MALE'
        ELSE
        'FEMALE'
    END
FROM patients;
  
  
  
  
  





























