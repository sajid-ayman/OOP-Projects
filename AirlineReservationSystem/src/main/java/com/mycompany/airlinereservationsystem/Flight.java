package com.mycompany.airlinereservationsystem;

public class Flight {
   private int flightNumber;
   private int availableSeats;

    public Flight(int flightNumber, int availableSeats) {
        this.flightNumber = flightNumber;
        this.availableSeats = availableSeats;
    }
   
   public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public boolean  bookSeat(){
       if(availableSeats>0)  {
           availableSeats--;
           System.out.println("Seat booked successfully!");
           return true;
       } 
       else {
            return false;      
       }
    }
}
