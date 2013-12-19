package com.bddinaction.chapter6.steps.thucydides;

import com.bddinaction.chapter6.model.Account;

public class TestDatabaseAPI {
    public DistanceBuilder theDistanceBetween(String departure) {
        return new DistanceBuilder(departure);
    }

    public void addAccount(Account account) {}

    public class DistanceBuilder {
        private final String departure;
        private String destination;

        public DistanceBuilder(String departure) {
            this.departure = departure;
        }

        public DistanceBuilder and(String destination) {
            this.destination = destination;
            return this;
        }

        public void is(int distance) {
            // Add this record to the test database
        }
    }
}
