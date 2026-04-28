/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18.Method_overloading;

/**
 *
 * @author Emranul Hoque
 */
public class Main {
    public static void main(String[] args) {
        method_overload t1=new method_overload();
        t1.add();
        
        System.out.println(""+t1.add(12, 320));
         System.out.println(""+ t1.add(36, 890, 740));
    }
}
