var stepDefinitionWrapper = function () {
	this.World = require("../support/world.js").World;

	this.Given(/^the distance between (.*) and (.*) is (\d+) km$/, function(start, end, distance, callback) {
		// TODO
	});

	this.Given(/^I am a (.*) Frequent Flyer member$/, function(status, callback) {
		// TODO
	});

	this.When(/^I fly from (.*) to (.*)$/, function(start, end, callback) {
		// TODO
	});

	this.Then(/^I should earn (\d+) travel points$/, function(points, callback) {
		// TODO
		// throw(new Error("Oh crap!"));
	});

	this.Then(/^I should earn (\d+) status points$/, function(points, callback) {
		// TODO
	});
}

module.exports = stepDefinitionWrapper