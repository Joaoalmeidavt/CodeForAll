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
    isbn BIGINT,
    user_id INTEGER AUTO_INCREMENT,
    loan BOOLEAN DEFAULT FALSE,

    PRIMARY KEY (isbn),
    FOREIGN KEY (isbn) REFERENCES books(isbn),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);

-- insert into books table
INSERT INTO books(isbn, title, publisher, author, published_year) 
VALUES
    (9789722327220, "Crime e Castigo", "Grupo Editorial Presença", "Fiodor Dostoievski", 2001),
    (9789725614730, "Guerra e Paz", "Clássica Editora", "Lev Tolstói", 2002),
    (9789896379766, "Órfão X", "Saída de Emergência", "Gregg Hurwitz", 2016),
    (9789720005953, "A jangada de pedra", "Porto Editora", "José Saramago", 2024);

-- insert into users table
INSERT INTO users(user_name) 
VALUES
    ("Miguel Arnaud"),
    ("Sandra Silva"),
    ("Tiago Lima"),
    ("Leonado Hugens");

-- inserto into reservations table
INSERT INTO reservations(isbn, user_id, loan) 
VALUES
    (9789725614730, 1, TRUE),
    (9789720005953, 2, TRUE),
    (9789896379766, 3, TRUE),
    (9789722327220, 4, TRUE);








-- answers

-- Do we have any books by Tolstoi?
SELECT COUNT(*) 
FROM books 
WHERE author = "Lev Tolstói";

-- How many books are out on loan?
SELECT COUNT(*) 
FROM reservations 
WHERE loan = TRUE;

-- Which company published "Crime e Castigo"?
SELECT publisher 
FROM books 
WHERE title = "Crime e Castigo";

-- Which users have borrows books published before 1974;
SELECT user_name 
FROM users u 
JOIN reservations r 
JOIN books b 
WHERE r.user_id = u.user_id
AND r.isbn = b.isbn
AND b.published_year < 1974;

