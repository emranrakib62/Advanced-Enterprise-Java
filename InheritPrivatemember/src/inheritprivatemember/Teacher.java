/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritprivatemember;

/**
 *
 * @author Emranul Hoque
 */
public class Teacher extends Person {
    
    private String Qualification;

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }
    
    
    void display(){
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
        System.out.println("Qualification:"+getQualification());
    }

   
    
}
