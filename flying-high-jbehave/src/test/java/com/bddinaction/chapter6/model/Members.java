package com.bddinaction.chapter6.model;

/**
 * A description goes here.
 * User: john
 * Date: 15/08/13
 * Time: 4:10 PM
 */
public class Members {
    public static Members getMember() {
        return new Members();
    }

    public FrequentFlyerMember withStatus(String status) {
        return FrequentFlyerMember.Gold;
    }
}
