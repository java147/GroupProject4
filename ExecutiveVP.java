package com.company;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class ExecutiveVP extends employee {
    private final double rate = 50.00;

    private boolean clearance = true;

    public ExecutiveVP(String firstname, String Lastname, String Gender, int count) {
        super(firstname, Lastname, Gender, count);

    }

    public boolean getClearance() {
        return clearance;
    }

    public double returnRate() {
        return rate;
    }
}
