package com.mycompany.carsystem;

public class Car extends Vehicle{    
    String fuel;
    int doorsNumber;
    boolean isSold;
    public Car(String fuel, int doorsNumber, String model, String company, long price) {
        super(model, company, price);
        this.fuel = fuel;
        this.doorsNumber = doorsNumber;
        this.isSold=false;
    }
    public void IsSoldOut(){
        if(this.isSold){
            System.out.println("Sorry,This Car is sold.");
        }
        else{
            System.out.println("congratulations ,now the Car for you!");
            this.isSold=true;
        }
    }
    @Override
    public String toString() {
        return("Car : "+this.company+
                "\nModel : "+this.model+
                "\nPrice : "+this.price+"\nFuel : "+this.fuel+
                "\nDoor Number : "+this.doorsNumber+
                "\nIs the item available?"+(this.isSold?"No":"Yes")
                +"\n-------------");
    }
}
