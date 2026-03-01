
package com.mycompany.oop_assignment;

public class Bus extends Transport{
    private int totalPassengers = 0;
    private double totalLuggageWeight = 0;

    @Override
    public double calculateFare(int distance) {
        
        double farePerKm = 4.0;
        
        return distance * farePerKm;
        
    }
   
    public void addPassenger(int passengers) {
        totalPassengers = totalPassengers+passengers;
        System.out.println(passengers + " passengers added. Total: " + totalPassengers);
    }

   
    public void addPassenger(int passengers, double luggageWeight) {
        totalPassengers =totalPassengers+ passengers;
        totalLuggageWeight =totalLuggageWeight+ luggageWeight;
        System.out.println(passengers + " passengers with " +luggageWeight+" kg luggage added.");
        System.out.println("Total passengers: "+ totalPassengers + ", Total luggage: "+totalLuggageWeight +" kg");
    }
        
        
        
        
    }

