/**
 * Creates a counter module with an initial value, zero if not provided
 */
exports.createCounter = function(counter) {
    let value = counter || 0;

    return {
        get: function() {
            return value;
        },
        increment: function() {
            value++;
        },
        reset: function() {
            value = 0;
        }
    };

};

/**
 * Creates a person module with name and age
 * An initial name value should be provided and
 * an exception thrown if not
 */
exports.createPerson = function(age, name) {
    // Validate `name`
    if (!name) {
        throw new Error("Name is required");
    }

    // Return the person object
    return {
        age: age || 0, // Default `age` to 0 if not provided
        name: name,
    };
};