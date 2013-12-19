package com.bddinaction.chapter6.model;


public class Account {
    private String owner;
    private int points;
    private int statusPoints;

    private Account(String owner) {
        this(owner, 0, 0);
    }

    private Account(String owner, int points, int statusPoints) {
        this.owner = owner;
        this.points = points;
        this.statusPoints = statusPoints;
    }

    public String getOwner() {
        return owner;
    }

    public int getPoints() {
        return points;
    }

    public int getStatuspoints() {
        return statusPoints;
    }

    public static Account forMember(String owner) {
        return new Account(owner);
    }

    public Account withPointBalance(int points) {
        return new Account(owner, points, statusPoints);
    }

    public Account withStatusPoints(int statusPoints) {
        return new Account(owner, points, statusPoints);
    }
}
