/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 *
 * @author Emranul Hoque
 */
public class Main {
    public static void main(String[] args) {
        
        
        MobileUser mu;
        
        mu=new Rahim();
        mu.call();
        mu.sendmessage();
        
          mu=new Karim();
        mu.sendmessage();
    }
    
}
