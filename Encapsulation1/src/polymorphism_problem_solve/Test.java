/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism_problem_solve;

/**
 *
 * @author Emranul Hoque
 */
public class Test {
    
    public static void main(String[] args) {
        Shape s1=new Shape();
    Rectangle r1=new Rectangle(8,9);
    Triangle t1=new Triangle(9,6);
    
        System.out.println(s1.area());
        System.out.println(r1.area());
        System.out.println(t1.area());
    
    }
    
  
}
