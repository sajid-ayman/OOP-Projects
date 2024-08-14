package com.mycompany.carsystem;

public class Truck extends Vehicle {
    int bearingCapacity;
    boolean isSold;
    public Truck(int bearingCapacity, String model, String company, long price) {
        super(model, company, price);
        this.bearingCapacity = bearingCapacity;
        this.isSold=false; 
    }
    public void IsSoldOut(){
        if(this.isSold){
            System.out.println("This truck is sold");
        }
        else{
            System.out.println("congratulations ,now the truck for you!");
            this.isSold=true;
        }
    }
    @Override
    public String toString() {
        return("Truck : "+this.company+
                "\nModel : "+this.model+
                "\nPrice : "+this.price+
                "\nBearing Capacity : "+this.bearingCapacity+" Kg"+
                "\nIs the item available?"+(this.isSold?"No":"Yes")
                +"\n-------------");
    }
}
