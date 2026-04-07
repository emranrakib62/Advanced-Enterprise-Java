/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assign_1_Solve;

/**
 *
 * @author Emranul Hoque
 */
public class Main {
    public static void main(String[] args) {
         Bus b=new Bus();
         Vehicle v=new Vehicle();
         v.setId(502);
         System.out.println("ID: "+v.getId());
         b.addPassenger(10);
         b.addPassenger(12, 230);
         System.out.println("Fare:"+b.calculateFare(10));
         
    }
    
}
