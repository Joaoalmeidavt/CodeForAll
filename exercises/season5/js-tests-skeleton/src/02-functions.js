/**
 * Return result of calling function with arguments as present in array
 */
exports.argsAsArray = function(fn, arr) {
    return fn(...arr);
};

/**
 * Return the result of calling a function with the provided obj as context
 * for the implicit argument this
 */
exports.speak = function(fn, obj) {
    return fn.call(obj);
};

/**
 * Return a prefixer function that concatenates a string argument with a prefix
 */
exports.stringPrefixer = function(prefix) {
    return function(str) {
        return `${prefix}${str}`;
    };
};

/**
 * Create an array of functions, each producing a result obtained
 * from applying the transform function to an argument from values array
 */
exports.makeResultFunctions = function(values, transform) {
    return values.map(value => () => transform(value));
};

/**
 * From a function which receives three arguments,
 * of which only two are available, create a new function
 * which wraps the original one with the missing argument
 */
exports.createWrapperFunction = function(fn, arg1, arg2) {
    return function(arg3){
        return fn(arg1, arg2, arg3);
    }
};

/**
 * Return the sum of all arguments
 */
exports.sumArguments = function() {
    return Array.from(arguments).reduce((acc, curr) => acc + curr, 0);
};

/**
 * Execute the function, passing it all the provided arguments
 */
exports.callIt = function(fn) {
    return fn(...Array.from(arguments).slice(1));
};

/**
 * From a function which receives a variable number of arguments,
 * return a wrapper function which adds additional argumens to the ones
 * available and calls the original function
 */
exports.createAddArgumentsFunction = function(fn, ...preArgs) {
    return function(...args) { 
        return fn(...preArgs, ...args); // Combine preArgs with the provided arguments
    };
};
