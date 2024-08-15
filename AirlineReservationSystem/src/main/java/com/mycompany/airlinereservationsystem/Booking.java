package com.mycompany.airlinereservationsystem;

public class Booking {
    private Passenger p;
    private Flight f;

    public Booking(Passenger p, Flight f) {
        this.p = p;
        this.f = f;
    }

    public Passenger getP() {
        return p;
    }

    public void setP(Passenger p) {
        this.p = p;
    }

    public Flight getF() {
        return f;
    }

    public void setF(Flight f) {
        this.f = f;
    }
    public void confrimeBooking(){
        System.out.println("Booking confirme for "+p.getName()+" on flight "+f.getFlightNumber());
    }

    
}
