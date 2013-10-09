package com.bddinaction.chapter6.cucumber.model;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 10:39 PM
 */
public class Account {
    private final String owner;
    private final int points;
    private final int statusPoints;

    public Account(String owner, int points, int statusPoints) {
        this.owner = owner;
        this.points = points;
        this.statusPoints = statusPoints;
    }

    public String getOwner() { return owner; }
    public int getPoints() { return points; }
    public int getStatusPoints() { return statusPoints; }
}
