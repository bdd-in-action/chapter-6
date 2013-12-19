var scenarioHooks = function () {
    this.Before(function(callback) {

        console.info("before")
        //this.initializeTheDatabase();
        callback();
    });
};

module.exports = scenarioHooks;