const users = require("./users.js");

//console.log(users);

// Create a new array with the users that have an odd id;

let newArr1 = users.filter(user => user.id % 2 == 1);
console.log(newArr1);

// Transform the array into an object where the key is the id and the value is the user

let newArr2 = users.reduce((acc, user) => {
    acc[user.id] = user;
    return acc;
}, {});
console.log(newArr2);

// The id of the user should be the index of the user in the array;

let newArr3 = users.reduce((acc, user) => {
    acc[user.id] = user;
    return acc;
}, []);
console.log(newArr3);

