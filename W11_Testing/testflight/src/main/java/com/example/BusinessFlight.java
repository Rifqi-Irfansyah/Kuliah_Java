package com.example;

public class BusinessFlight extends AbstractFlight {
    public BusinessFlight(String id) {
        super(id);
    }

    @Override
        public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip()) {
            return passengers.add(passenger);
        }
        return false;
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }
}
