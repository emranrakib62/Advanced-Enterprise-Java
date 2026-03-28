/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problem_3;

/**
 *
 * @author Emranul Hoque
 */
public class Threadone extends Thread {
   
    public void run(){
         try{
              for(int i=1;i<=10;i++){
            System.out.println("Serial(1 to 10)=="+i);
            Thread.sleep(1000);
        }
         }catch(Exception e){
             e.printStackTrace();
         }
       
    }
    
    
}
