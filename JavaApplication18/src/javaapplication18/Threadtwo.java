/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Emranul Hoque
 */
public class Threadtwo implements Runnable {
    public void run(){
        
      try{
            for(int i=1;i<=20;i++){
    System.out.println(i);
    Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(""+e);
                }
        
    }
}

