/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice_theory_Exam;

/**
 *
 * @author Emranul Hoque
 */
public class Test {
    public static void main(String[] args) {
        Threadone one=new Threadone();
        one.start();
        Threadtwo two=new Threadtwo();
        Thread t1=new Thread(two);
        t1.start();
    }
}
