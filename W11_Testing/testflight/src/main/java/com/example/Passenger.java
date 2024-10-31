package com.example;

public class Passenger {
    private final String name;
    private boolean vip;

    public Passenger(String name, boolean vip) {
        this.name = name;
        this.vip = vip;
    }

    public Passenger(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean isVip() {
        return vip;
    }
}
