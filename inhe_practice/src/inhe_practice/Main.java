/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inhe_practice;

/**
 *
 * @author Emranul Hoque
 */
public class Main {
    public static void main(String[] args) {
        
        Vehicle v1=new Vehicle();
        v1.setV_id(102);
        System.out.println("v_id:"+v1.getV_id());
        
        Bus b=new Bus();
        b.showTransportType();
        
        System.out.println("Fare:"+b.calculateFare(10));
        
        b.addpassenger(30);
        b.addpassenger(10, 13.20);
        
   
        
        
    }
}
