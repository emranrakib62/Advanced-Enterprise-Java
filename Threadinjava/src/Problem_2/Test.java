/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem_2;

/**
 *
 * @author Emranul Hoque
 */
public class Test {
    public static void main(String[] args) {
        Threadone one=new Threadone();
        ThreadTwo two=new ThreadTwo();
        
        Thread t1=new Thread(one);
        Thread t2=new Thread(two);
        t1.start();
        t2.start();
    }
}
