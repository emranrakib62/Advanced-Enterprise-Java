/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice11;

/**
 *
 * @author Emranul Hoque
 */
public class University {
    
    String name;
    int age;
    University(){
        name="unkonw";
        age=0;
    }
    University(String n){
        name=n;
        age=0;
    }
    University(String n,int a){
        name=n;
        age=a;
    }
    
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    
    
    
    
    
    
}
