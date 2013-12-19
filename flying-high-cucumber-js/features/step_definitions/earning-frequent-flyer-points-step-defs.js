var stepDefinitionWrapper = function () {
	this.World = require("../support/world.js").World;
	var should = require('chai').should()

	var distance_travelled, traveller_status;

	var calculate_travel_points = function(status, distance) {
        return distance / 2;
    }

	this.Given(/^the distance between (.*) and (.*) is (\d+) km$/,
		function(start, end, distance, callback) {
      distance_travelled = distance;
	  callback();
	});

	this.Given(/^I am a (.*) Frequent Flyer member$/, function(status, callback) {
      traveller_status = status;
	  callback();
	});

	this.When(/^I fly from (.*) to (.*)$/, function(start, end, callback) {
	  callback();
	});

	this.Then(/^I should earn (\d+) travel points$/,
		     function(expected_travel_points, callback) {
	  var calculatedTravelPoints = calculate_travel_points(traveller_status, distance_travelled);
	  calculatedTravelPoints.should.equal(parseInt(expected_travel_points))
	  callback();
	});
};

module.exports = stepDefinitionWrapper;