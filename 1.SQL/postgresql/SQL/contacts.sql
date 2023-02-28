DROP TABLE IF EXISTS contact_seeking;
DROP TABLE IF EXISTS contact_interest;
DROP TABLE IF EXISTS my_contacts;
DROP TABLE IF EXISTS zip_codes;
DROP TABLE IF EXISTS professions;
DROP TABLE IF EXISTS statuses;
DROP TABLE IF EXISTS seekings;
DROP TABLE IF EXISTS interests;
	
CREATE TABLE zip_codes (
	zip_code_id BIGSERIAL CONSTRAINT zip_code_id_key PRIMARY KEY,
	zip_code CHAR(11) NOT NULL,
	city VARCHAR(30) NOT NULL,
	state_name VARCHAR(30) NOT NULL,
	state_abbr CHAR(2) NOT NULL
);	

INSERT INTO zip_codes
(
	zip_code,
	city,
	state_name,
	state_abbr
)
VALUES
('36013-36191', 'Mongomery', 'Alabama', 'AL'),
('99703-99781', 'Fairbanks', 'Alaska', 'AK'),
('85641-85705', 'Tucson', 'Arizona', 'AR');

CREATE TABLE professions (
	profession_id BIGSERIAL CONSTRAINT professions_id_key PRIMARY KEY,
	profession_name VARCHAR(30) UNIQUE NOT NULL
);

INSERT INTO professions(profession_name)
VALUES 
('doctor'),
('teacher'), 
('software developer'),
('student');

CREATE TABLE statuses (
	status_id BIGSERIAL CONSTRAINT status_id_key_2 PRIMARY KEY,
	status_name VARCHAR(30) UNIQUE NOT NULL
);

INSERT INTO statuses(status_name)
VALUES
('single'),
('divorced');

CREATE TABLE seekings
(
	seeking_id BIGSERIAL CONSTRAINT seeking_id_key PRIMARY KEY,
	seeking VARCHAR(50) UNIQUE NOT NULL
);

INSERT INTO seekings
(
	seeking
)
VALUES
('single male'),
('single female'),
('same profession'),
('employed'),
('student'),
('retired'),
('over 50'),
('under 25'),
('under 50');

CREATE TABLE my_contacts (
	contact_id BIGSERIAL CONSTRAINT contact_id_key PRIMARY KEY,
	last_name VARCHAR(30) NOT NULL,
	first_name VARCHAR(30) NOT NULL,
	gender CHAR(1) NOT NULL,
	phone VARCHAR(10) UNIQUE NOT NULL,
	email VARCHAR(30) UNIQUE NOT NULL,
	zip_code_id bigint REFERENCES zip_codes(zip_code_id) ON DELETE CASCADE,
	status_id bigint REFERENCES statuses(status_id) ON DELETE CASCADE,
	profession_id bigint REFERENCES professions(profession_id) ON DELETE CASCADE
);

INSERT INTO my_contacts (
	last_name,
	first_name,
	gender,
	phone,
	email,
	zip_code_id,
	status_id,
	profession_id
) VALUES 
	('Tom','Smith','F','0780615009','tom@gmail.com', 1,1,1), 
    ('Gugu','Ndaba','F','0780615012','gugu@gmail.com',2,2,2),
    ('Jo','Nala','M','0780615078','jo@gmail.com',1,1,3),
    ('Mary','Smith','F','0610615009','mary@gmail.com',2,2,4),
    ('Kyle','Koo','M','0710615009','kyle@gmail.com',1,2,1),
    ('Sizwe','Nchabe','M','0840615099','sizwe@gmail.com',3,1,3),
    ('Liz','Sun','F','0830777009','liz@gmail.com',3,1,2);	
	
CREATE TABLE contact_seeking
(
	contact_id BIGINT REFERENCES my_contacts(contact_id) ON DELETE CASCADE,
	seeking_id BIGINT REFERENCES seekings(seeking_id) ON DELETE CASCADE
);

INSERT INTO contact_seeking
(contact_id, seeking_id)
VALUES
(1, 1),
(1, 3),
(1, 7),
(2, 1),
(2, 8),
(3, 2),
(3, 3),
(3, 7),
(4, 1),
(4, 5),
(4, 9),
(5, 2),
(5, 3),
(5, 7),
(6, 2),
(6, 3),
(6, 8),
(7, 1),
(7, 6),
(7, 7);

CREATE TABLE interests
(
	interest_id BIGSERIAL CONSTRAINT interest_id_key PRIMARY KEY,
	interest VARCHAR(50) UNIQUE NOT NULL
);

INSERT INTO
interests (interest)
VALUES
('hiking'),
('reading'),
('biking'),
('cooking'),
('running'),
('cycling');



SELECT * FROM interests;

CREATE TABLE contact_interest
(
	contact_id BIGINT REFERENCES my_contacts(contact_id),
	interest_id BIGINT REFERENCES interests(interest_id)
);

INSERT INTO contact_interest
(contact_id, interest_id)
VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(2, 4),
(2, 5),
(3, 1),
(3, 3),
(4, 3),
(5, 2),
(5, 6),
(6, 3),
(6, 4),
(6, 5),
(6, 6),
(7, 1);
/*
SELECT cont.contact_id, cont.last_name, cont.first_name, cont.gender, cont.phone, /*seeking1, seeking2, seeking3,*/
		 /*cont.zip_code_id,*/ zip.zip_code, zip.city, zip.state_name, zip.state_abbr, /*cont.profession_id,*/ prof.profession_name, sta.status_name, s.seeking
FROM my_contacts cont
JOIN zip_codes zip
ON cont.zip_code_id = zip.zip_code_id
JOIN professions prof
ON cont.profession_id = prof.profession_id
JOIN statuses sta
ON cont.status_id = sta.status_id
ORDER BY cont.contact_id;*/

SELECT c.first_name, c.last_name, s.seeking
FROM my_contacts c
JOIN contact_seeking cs
ON c.contact_id = cs.contact_id
JOIN seekings s
ON s.seeking_id = cs.seeking_id;

-- You need to join 3 tables together --
SELECT c.first_name, c.last_name, i.interest
FROM my_contacts c
JOIN contact_interest ci
ON c.contact_id = ci.contact_id
JOIN interests i
ON i.interest_id = ci.interest_id;


