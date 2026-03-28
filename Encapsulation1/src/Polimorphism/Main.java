/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorphism;

/**
 *
 * @author Emranul Hoque
 */
public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        p.display();
        p=new Teacher();
        p.display();
        p=new Student();
        p.display();
    }
}
