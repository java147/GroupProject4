package com.company;

public class StoreManager extends employee{
    private final double rate = 20.45;

    private boolean clearance = false;

    public StoreManager(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);
    }

    public boolean getClearance() {
        return clearance;
    }

    public double returnRate() {
        return rate;
    }
}
