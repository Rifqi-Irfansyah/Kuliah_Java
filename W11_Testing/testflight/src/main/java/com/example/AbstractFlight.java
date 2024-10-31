package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractFlight {
    private final String id;
    List<Passenger> passengers = new ArrayList<>();
    
    public AbstractFlight(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public List<Passenger> getPassengersList() {
        return Collections.unmodifiableList(passengers);
    }

    public abstract boolean addPassenger(Passenger passenger);
    public abstract boolean removePassenger(Passenger passenger);
}