/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author Emranul Hoque
 */
public class Test {
    public static void main(String[] args) {
        Person p1 =new Person();
      p1.setname("Rakib");
        System.out.println("name: "+p1.getname());
        
        p1.SetID(101);
        System.out.println("id:"+p1.getId());
    }
}
