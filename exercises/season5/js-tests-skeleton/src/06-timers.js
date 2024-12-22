/**
 * Return a stop watch object with the following API:
 * getTime - return number of seconds elapsed
 * start - start counting time
 * stop - stop counting time
 * reset - sets seconds elapsed to zero
 */
exports.createStopWatch = function() {
    return {
        getTime: function() {
            return this.seconds || 0;
        },
        start: function() {
            this.startTime = new Date();
        },
        stop: function() {
            this.endTime = new Date();
            this.seconds = (this.endTime - this.startTime) / 1000;
        },
        reset: function() {
            this.seconds = 0;
        }
    }
};
