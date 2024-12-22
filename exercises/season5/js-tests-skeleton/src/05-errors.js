/**
 * Return the result of invoking the provided function
 * If an exception is thrown, return the enclosed error message
 */
exports.callIt = function(fn) {
    try {
        return fn();
    } catch (e) {
        return e.message;
    }
};

/**
 * Return true if the provided arguments are equal,
 * throw an error with an enclosed message otherwise
 */
exports.assertEqual = function(a, b) {
    if (a !== b) {
        throw new Error(a + " is not equal to " + b);
    }
    return true;
};

/**
 * Return a custom error constructor with a timestamp property
 * indicating when the error occurred
 */
exports.createCustomError = function() {
    return function(message) {
        this.message = message;
        this.timestamp = new Date();
    };
};
