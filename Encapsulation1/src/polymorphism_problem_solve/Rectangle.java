/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism_problem_solve;

/**
 *
 * @author Emranul Hoque
 */
public class Rectangle extends Shape{
double l,w;

Rectangle(double l,double w){
    this.l=l;
    this.w=w;
}
   double area(){
       return l*w;
   }
    
}
