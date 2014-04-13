package com.bddinaction.chapter6.model;

import java.security.DigestInputStream;
import java.util.Date;

public enum FrequentFlyerMember {

    Gold(10000), Silver(10001), Bronze(10002), Standard(10003);

    private FrequentFlyerMember(long membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public final long membershipNumber;

    public int getPointsFor(Trip trip) {
        return 439;
    }

    public void addFlightToHistory(Flight flight) {

    }

    public FlightHistoryBuilder flewOnFlight(Flight flight) {
        return new FlightHistoryBuilder(flight);
    }

    public class FlightHistoryBuilder {
        public FlightHistoryBuilder(Flight flight) {
            // TODO: Add this flight to the member flight history
        }

        public void on(Date date) {
        }
    }
}
