DROP DATABASE IF EXISTS library;

CREATE DATABASE library;

USE library;

CREATE TABLE books
(
    isbn BIGINT PRIMARY KEY,
    title VARCHAR(40) NOT NULL,
    publisher VARCHAR(40) NOT NULL,
    author VARCHAR(40) NOT NULL,
    published_year INTEGER NOT NULL
);

CREATE TABLE users
(
    user_id INTEGER AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(40) NOT NULL
);

CREATE TABLE reservations
(
    isbn BIGINT PRIMARY KEY,
    user_id INTEGER AUTO_INCREMENT,
    loan BOOLEAN DEFAULT FALSE,

    FOREIGN KEY (isbn) REFERENCES books(isbn),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- insert into books table
INSERT INTO books(isbn, title, publisher, author, published_year) VALUES (9789722327220, "Crime e Castigo", "Grupo Editorial Presença", "Fiodor Dostoievski", 2001);
INSERT INTO books(isbn, title, publisher, author, published_year) VALUES (9789725614730, "Guerra e Paz", "Clássica Editora", "Lev Tolstói", 2002);
INSERT INTO books(isbn, title, publisher, author, published_year) VALUES (9789896379766, "Órfão X", "Saída de Emergência", "Gregg Hurwitz", 2016);
INSERT INTO books(isbn, title, publisher, author, published_year) VALUES (9789720005953, "A jangada de pedra", "Porto Editora", "José Saramago", 2024);

-- insert into users table
INSERT INTO users(user_name) VALUES ("Miguel Arnaud");
INSERT INTO users(user_name) VALUES ("Sandra Silva");
INSERT INTO users(user_name) VALUES ("Tiago Lima");
INSERT INTO users(user_name) VALUES ("Leonado Hugens");

-- inserto into reservations table
INSERT INTO reservations(isbn, user_id, loan) VALUES (9789725614730, 1, TRUE);
INSERT INTO reservations(isbn, user_id, loan) VALUES (9789720005953, 2, TRUE);
INSERT INTO reservations(isbn, user_id, loan) VALUES (9789896379766, 3, TRUE);
INSERT INTO reservations(isbn, user_id, loan) VALUES (9789722327220, 4, TRUE);

