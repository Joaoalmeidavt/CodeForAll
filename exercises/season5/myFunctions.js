// Filter
function filter(arr, callback){

    result = [];

    for(let i = 0; i < arr.length; i++){
        if(callback(arr[i])){
            result.push(arr[i]);
        }
    }

    return result;
}

console.log(filter([1, 2, 3, 4, 5], (n) => n % 2 == 0));


// Map
function map(arr, callback){

    result = [];

    for(let i = 0; i < arr.length; i++){
        result.push(callback(arr[i]));
    }

    return result;
}

console.log(map([1, 2, 3, 4, 5], (n) => n * 2));

// Reduce
function reduce(arr, callback, initialValue){

    for(let i = 0; i < arr.length; i++){
        initialValue = callback(initialValue, arr[i]);
    }

    return initialValue;
}

console.log(reduce([1, 2, 3, 4, 5], (acc, val) => acc + val, 0));