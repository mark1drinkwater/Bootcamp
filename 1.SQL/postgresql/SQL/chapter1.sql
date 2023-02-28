CREATE TABLE teachers (
	id bigserial,
	first_name varchar(25),
	last_name varchar(50),
	school varchar(50),
	hire_date date,
	salary numeric
);

INSERT INTO teachers (first_name, last_name, school, hire_date, salary)
VALUES ('Janet', 'Smith', 'F.D. Roosevelt HS', '2011-10-30', 36200),
('Lee', 'Reynolds', 'F.D. Roosevelt HS', '1993-05-22', 65000),
('Samuel', 'Cole', 'Myers Middle School', '2005-08-01', 43500),
('Samantha', 'Bush', 'Myers Middle School', '2011-10-30', 36200),
('Betty', 'Diaz', 'Myers Middle School', '2005-08-30', 43500),
('Kathleen', 'Roush', 'F.D. Roosevelt HS', '2010-10-22', 38500);

SELECT * FROM teachers;

SELECT first_name, last_name, salary FROM teachers;

-- Try it out yourself #1
CREATE TABLE animal_species (
	animal_id bigserial PRIMARY KEY,
	animal_colloquial_name varchar(30),
	animal_scientific_name varchar(50)
);

CREATE TABLE zoo_animals (
	zoo_animal_id bigserial PRIMARY KEY,
	animal_id bigint REFERENCES animal_species(animal_id),
	date_of_birth date,
	gender char(1)
);

-- Try it out yourself #3
INSERT INTO animal_species (animal_colloquial_name, animal_scientific_name)
VALUES ('Panda', 'Ailuropoda melanoleuca'),
('Tiger', 'Panthera tigris'),
('Frog', 'Anura');

INSERT INTO zoo_animals (animal_id, date_of_birth, gender)
VALUES (1, '2015-05-01', 'M'),
(2, '2015-08-15', 'F'),
(1, '2015-01-01', 'F'),
(3, '2015-02-06', 'M');

/* Without comma Error Test 
	INSERT INTO animal_species (animal_colloquial_name, animal_scientific_name)
	VALUES ('Panda', 'Ailuropoda melanoleuca')
	('Tiger', 'Panthera tigris')
*/