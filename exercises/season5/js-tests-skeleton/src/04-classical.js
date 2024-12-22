/**
 * Return a Rectangle constructor function
 * Rectangle instances should contain x and y properties
 * and they should know how to calculate their area and perimeter
 */
exports.createRectangleConstructor = function() {
    return function(x, y) { // Proper constructor function
        this.x = x;
        this.y = y;

        this.area = function() {
            return this.x * this.y;
        };

        this.perimeter = function() {
            return 2 * (this.x + this.y);
        };
    };
};

/**
 * Return a constructor function that
 * subclasses the provided constructor
 */
exports.createSubClass = function(fn) {
    return function() {
        fn.apply(this, arguments);
    }
};


