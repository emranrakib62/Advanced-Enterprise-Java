/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem_3;

/**
 *
 * @author Emranul Hoque
 */
public class Threadtwo extends Thread {
    public void run(){
         try{
             for(int i=10;i>=1;i--){
            System.out.println("Serial(10 to 1)::"+i);
            Thread.sleep(2000);
        }
         }catch(Exception e){
             e.printStackTrace();
         }
        
    }
    
    
}
