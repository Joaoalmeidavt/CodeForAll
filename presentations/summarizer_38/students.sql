DROP DATABASE IF EXISTS school;
CREATE DATABASE school;
USE school;


CREATE TABLE students
(
id INTEGER PRIMARY KEY,
name VARCHAR(15) NOT NULL,
grade INTEGER NOT NULL
);

INSERT INTO students(id, name, grade) VALUES (1, 'Miguel', 18);
INSERT INTO students(id, name, grade) VALUES (2, 'Carlos', 15);
INSERT INTO students(id, name, grade) VALUES (3, 'Carolina', 14);
INSERT INTO students(id, name, grade) VALUES (4, 'Henrique', 15);
INSERT INTO students(id, name, grade) VALUES (5, 'Jorge', 18);
INSERT INTO students(id, name, grade) VALUES (6, 'Diogo', 16);
INSERT INTO students(id, name, grade) VALUES (7, 'Gustavo', 19);
INSERT INTO students(id, name, grade) VALUES (8, 'Mafalda', 17);
