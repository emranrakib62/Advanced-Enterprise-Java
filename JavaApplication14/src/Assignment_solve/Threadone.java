/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment_solve;

/**
 *
 * @author Emranul Hoque
 */
public class Threadone extends Thread {
    public void run(){
    try{
     
        for(int i = 1;i<=10;i++){
            System.out.println(""+i);
        }
        Thread.sleep(1000);
        
    }
catch(Exception e){
e.printStackTrace();

}
    } 
}
