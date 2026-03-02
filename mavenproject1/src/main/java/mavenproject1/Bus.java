/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

class Bus extends Transport {

    private final double farePerPassenger = 50.0;

    // Must also be public
    @Override
    public double calculateFare(int passengers) {
        double totalFare = passengers * farePerPassenger;
        System.out.println("Total Fare: " + totalFare);
        return totalFare;
    }

    // Method Overloading (Polymorphism)
    public void addPassenger(int passengers) {
        System.out.println(passengers + " passengers added.");
    }

    public void addPassenger(int passengers, double luggageWeight) {
        System.out.println(passengers + " passengers added with luggage weight: "
                + luggageWeight + " kg.");
    }
}

