/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice11;

/**
 *
 * @author Emranul Hoque
 */
public class Main {
    public static void main(String[] args) {
        Threadone t1=new Threadone();
        t1.start();
        Threadtwo t2=new Threadtwo();
        
        Thread s1=new Thread(t2);
        s1.start();
    }
}
