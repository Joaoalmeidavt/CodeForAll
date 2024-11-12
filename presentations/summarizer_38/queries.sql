SELECT boat_name FROM boats;

SELECT * FROM boats WHERE color = "red";

SELECT * FROM sailors WHERE age > 20 AND age < 30;

SELECT sailor_id, sailor_name FROM sailors WHERE age < 50 AND sailor_id > 5;




SELECT sailors.sailor_name, boats.boat_name
FROM sailors
JOIN reservations ON sailors.sailor_id = reservations.sailor_id
JOIN boats ON reservations.boat_id = boats.boat_id;
