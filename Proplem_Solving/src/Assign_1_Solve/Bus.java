/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assign_1_Solve;

/**
 *
 * @author Emranul Hoque
 */
public class Bus extends Transport{
    

    @Override
    public int calculateFare(int distance){
        return 10*distance;
       
    }
    public void addPassenger(int noofpas){
        System.out.println("passenger addded:"+noofpas);
    }
    
    public void addPassenger(double noofpas,double weight){
        System.out.println(noofpas+"passengerwithlaggage:"+weight);
        
    }

}
