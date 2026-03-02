/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mavenproject1;

abstract class Transport {

    // Must be public
    public abstract double calculateFare(int passengers);

    // Normal method
    public void showTransportType() {
        System.out.println("This is a university transport system.");
    }
}
