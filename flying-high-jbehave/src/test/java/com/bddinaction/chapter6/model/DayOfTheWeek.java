package com.bddinaction.chapter6.model;

import org.joda.time.DateTimeConstants;

public enum DayOfTheWeek {
    Monday(DateTimeConstants.MONDAY),
    Tuesday(DateTimeConstants.TUESDAY),
    Wednesday(DateTimeConstants.WEDNESDAY),
    Thursday(DateTimeConstants.THURSDAY),
    Friday(DateTimeConstants.FRIDAY),
    Saturday(DateTimeConstants.SATURDAY),
    Sunday(DateTimeConstants.SUNDAY);

    private final int value;

    DayOfTheWeek(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
