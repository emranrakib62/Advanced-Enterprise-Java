package com.mycompany.oop_assignment;


public class main {

    public static void main(String[] args) {
        Vehicle V1=new Vehicle();
        V1.setVehicleId(110);
       System.out.println("Vehicle ID: "+V1.getVehicleId());
       
       
         Bus bus=new Bus();
        bus.showTransportType();
       
        double fare=bus.calculateFare(15);
        
        System.out.println("Fare: "+fare);
       
       
       bus.addPassenger(5); 
      bus.addPassenger(3,60);

    }
}