package com.mycompany.airlinereservationsystem;

public class AirlineReservationSystem {

    public static void main(String[] args) {
        //long passNumber, String name, int age
        Passenger p1=new Passenger(10,"Islam",19);
        //int flightNumber, int availableSeats
        Flight f1=new Flight(5,8);
        Booking b1=new Booking(p1,f1);
        if(f1.bookSeat()){
            b1.confrimeBooking();
        }
        else{
            System.out.println("No avalible seats.");
        }
        
    }
}
