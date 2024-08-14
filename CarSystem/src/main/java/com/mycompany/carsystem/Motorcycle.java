package com.mycompany.carsystem;

public class Motorcycle extends Vehicle{
    boolean isSold=false;
    public Motorcycle(String model, String company, long price) {
        super(model, company, price);
        this.isSold=false;
    }
    public void IsSoldOut(){
        if(this.isSold){
            System.out.println("Sorry,This Motorcycle is sold.");
        }
        else{
            System.out.println("congratulations ,now the Motorcycle for you!");
            this.isSold=true;
        }
    }
    @Override
    public String toString() {
        return(
                "\nMotorcycle : "+this.company+
                "\nModel : "+this.model+
                "\nPrice : "+this.price+
                "\nIs the item available?"+(this.isSold?"No":"yes")
                +"\n-------------");
    }
    
}
