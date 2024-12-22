DROP DATABASE IF EXISTS boat_booking;
CREATE DATABASE boat_booking;
USE boat_booking;

DROP TABLE IF EXISTS sailors;
DROP TABLE IF EXISTS boats;
DROP TABLE IF EXISTS reservations;

CREATE TABLE sailors(
    sailor_id INTEGER,
    sailor_name CHAR(15),
    rating NUMERIC(4,2),
    age INTEGER,
    PRIMARY KEY (sailor_id)
);

CREATE TABLE boats(
    boat_id INTEGER,
    boat_name CHAR(15),
    color CHAR(15),
    PRIMARY KEY (boat_id)
);

CREATE TABLE reservations(
    sailor_id INTEGER, 
    boat_id INTEGER, 
    day DATE,
    PRIMARY KEY (boat_id, day),
    FOREIGN KEY (sailor_id) REFERENCES sailors(sailor_id),
    FOREIGN KEY (boat_id) REFERENCES boats(boat_id)
);

INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (1, 'Manuel', 44.44, 24);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (2, 'Nuno', 55.44, 23);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (3, 'Soraia', 44.44, 44);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (4, 'Manuela', 60.44, 26);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (5, 'Rodrigo', 60.44, 28);
INSERT INTO sailors(sailor_id, sailor_name, rating, age) VALUES (6, 'Ana', 20.44, 28);


INSERT INTO boats(boat_id, boat_name, color) VALUES (1, 'Santana', 'red');
INSERT INTO boats(boat_id, boat_name, color) VALUES (2, 'Titanic', 'white');
INSERT INTO boats(boat_id, boat_name, color) VALUES (3, 'Mermaid', 'blue');
INSERT INTO boats(boat_id, boat_name, color) VALUES (4, 'O Velejador', 'green');
INSERT INTO boats(boat_id, boat_name, color) VALUES (5, 'O Esquecido', 'grey');
INSERT INTO boats(boat_id, boat_name, color) VALUES (100, 'The One', 'yellow');


INSERT INTO reservations(sailor_id, boat_id, day) VALUES (1,1, '2012-01-01');
INSERT INTO reservations(sailor_id, boat_id, day) VALUES (1,2, '2013-02-01');
INSERT INTO reservations(sailor_id, boat_id, day) VALUES (1,3, '2014-03-01');
INSERT INTO reservations(sailor_id, boat_id, day) VALUES (2,4, '2015-04-01');
INSERT INTO reservations(sailor_id, boat_id, day) VALUES (3,1, '2011-05-01');
INSERT INTO reservations(sailor_id, boat_id, day) VALUES (5,100, '2010-06-01');
INSERT INTO reservations(sailor_id, boat_id, day) VALUES (6,100, '2012-06-01');
