SELECT * FROM teachers;

SELECT first_name, last_name, salary 
FROM teachers
WHERE last_name='Smith';

SELECT DISTINCT school
FROM teachers;

SELECT DISTINCT first_name
FROM teachers;

SELECT last_name, school, hire_date
FROM teachers
ORDER BY school ASC, hire_date DESC;

SELECT last_name, school, hire_date
FROM teachers
WHERE school = 'Myers Middle School';

SELECT last_name, school, hire_date
FROM teachers
WHERE first_name = 'Janet';

SELECT school
FROM teachers
WHERE school != 'F.D. Roosevelt HS';

SELECT first_name, last_name, hire_date
FROM teachers
WHERE hire_date < '2000-01-01';

SELECT first_name, last_name, school, salary
FROM teachers
WHERE salary BETWEEN 40000 AND 65000;

SELECT first_name
FROM teachers
WHERE first_name ILIKE 'sam%';

SELECT *
FROM teachers
WHERE school = 'Myers Middle School'
	AND salary < 40000;

SELECT *
FROM teachers
WHERE last_name = 'Cole'
	OR last_name = 'Bush';

SELECT *
FROM teachers
WHERE school = 'F.D. Roosevelt HS'
	AND (salary < 38000 OR salary > 40000);
	
SELECT first_name, last_name, school, hire_date, salary
FROM teachers
WHERE school LIKE '%Roos%'
ORDER BY hire_date DESC;	

--Try it Yourself #1
SELECT first_name, last_name
FROM teachers
ORDER BY school, last_name;

--Try it Yourself #2
SELECT first_name, last_name
FROM teachers
WHERE first_name LIKE 'S%'
	AND salary > 40000;

--Try it Yourself #3
SELECT first_name, last_name
FROM teachers
WHERE hire_date >= '2010-01-01'
ORDER BY SALARY DESC;