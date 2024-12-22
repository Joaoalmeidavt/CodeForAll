/**
 * Create a developer person object with a code method
 * that delegates to the provided person object
 */
exports.createDelegate = function(person) {
    return {
        code: function(){
            return person.name + " is coding";
        }
    }
};


/**
 * Borrow and invoke the person say method on top of the company object
 */
exports.borrowSayMethod = function(person, company) {
    return person.say.call(company);
};

/**
 * Iterate over all of the provided object own properties,
 * returning an array of key: value strings
 */
exports.iterate = function(obj) {
    return Object.keys(obj).map(function(key){
        return key + ": " + obj[key];
    });
};

/**
 * Add a repeatify method to all JavaScript Strings
 * 'string'.repeatify(3) should equal 'stringstringstring'
 * NOTE: This exercise exists for a pedagogic purpose only,
 * do not think doing stuff like this is a good idea...
 *
 * String already contains a repeat method, let's NOT use that one.
 */
exports.extendString = function() {
    String.prototype.repeatify = function(times){
        let result = "";
        for (let i = 0; i < times; i++) {
            result += this;
        }
        return result;
    };
};
