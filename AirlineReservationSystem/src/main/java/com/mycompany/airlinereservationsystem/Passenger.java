package com.mycompany.airlinereservationsystem;

public class Passenger extends Person {
    private long passNumber;
    public Passenger(long passNumber, String name, int age) {
        super(name, age);
        this.passNumber = passNumber;
    }
    public long getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(long passNumber) {
        this.passNumber = passNumber;
    }

}
