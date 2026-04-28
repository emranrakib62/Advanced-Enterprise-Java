/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18.constructor;

/**
 *
 * @author Emranul Hoque
 */
public class constructor {
    String name;
    int age;
    
    
     constructor(){
        age=0;
        name="unkonwn";
    }
     constructor(String n,int a){
        name=n;
        age=a;
    }
    
    void display(){
            System.out.println(age+""+name);
}
        
    
    
    
}
