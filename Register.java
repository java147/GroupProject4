package com.company;

public class Register extends employee {
    private final double rate = 10.75;

    private boolean clearance = false;

    public Register (String firstname, String Lastname, String Gender, int count) {
        super (firstname, Lastname, Gender, count);
    }

    public boolean getClearance() {
        return clearance;
    }

    public double returnRate() {
        return rate;
    }
}
