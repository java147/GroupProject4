package com.company;

public class BranchManager extends employee {
    private final double rate  = 40.87;

    private boolean clearance = true;

    public BranchManager(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);

    }
    public boolean getClearance() {
        return clearance;
    }

}
