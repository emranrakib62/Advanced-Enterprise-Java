/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18.Method_overloading;

/**
 *
 * @author Emranul Hoque
 */
public class method_overload {
    void add (){
        System.out.println("This is empty");
    }
    
    int add(int a,int b){
        return a+b;
    }
    
    int add(int a,int b,int c){
        return a+b+c;
    }
}
