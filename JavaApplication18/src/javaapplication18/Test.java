/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author Emranul Hoque
 */
public class Test {
    public static void main(String[] args) {
        Threadone t1=new Threadone();
        Threadtwo t2=new Threadtwo();
        
        Thread s11=new Thread(t1);
        Thread s12=new Thread(t2);
        
        s11.start();
        s12.start();
    }
}
