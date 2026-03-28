/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemsolving_abstraction;

/**
 *
 * @author Emranul Hoque
 */
public abstract class Shape {
    double dim1,dim2;
    Shape(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract void area();
}
