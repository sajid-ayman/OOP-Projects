package com.mycompany.carsystem;

public class CarSystem {

    public static void main(String[] args) {
        Car[] cars=new Car[3];
        Truck[] trucks=new Truck[3];
        Motorcycle[] motors=new Motorcycle[3];
       //Add Cars
        cars[0]=new Car("Desil",4,"2005","KIA",40000);
        cars[1]=new Car("Desil",2,"2016","BMW",105000);
        cars[2]=new Car("Gasoline",2,"2020","Lamborghini",200000);
       //Add Trucks
        trucks[0]=new Truck(500,"2014","VOLVO",900000);
        trucks[1]=new Truck(1000,"2018","DAF",1250000);
        trucks[2]=new Truck(950,"2020","Mercedes",2000000);
       //Add Motorcycles
        motors[0]=new Motorcycle("2009","Honda",6000);
        motors[1]=new Motorcycle("2012","Honda",9000);
        motors[2]=new Motorcycle("2014","Suzuki",10000);
       //search for car c
       Car  c=new Car("Desil",4,"2005","KIA",40000);
       Car  c2=new Car("Gasoline",2,"2020","KIA",40000);
       Car  c3=new Car("Desil",4,"2005","KIA",40000);
       boolean found=false;
       for (Car i:cars) {
           if(i.company==c.company&&i.doorsNumber==c.doorsNumber
              &&i.fuel==c.fuel&&i.model==c.model&&i.price==c.price)found=true;
        }
       if(found)System.out.println("This car is Avalible.");
       else System.out.println("This car is Invalible.");


      //buy new car
      cars[0].IsSoldOut();
      //car is sold
      cars[0].IsSoldOut();
      //show Vehicle specifications
        System.out.println(trucks[2].toString());
        System.out.println(cars[0].toString());
        System.out.println(motors[0].toString());
      
    }
}
