/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filecreate;

/**
 *
 * @author Emranul Hoque
 */
public class Threadtwo implements Runnable {

   
    public void run() {
       try{
           for(int i=1;i<10;i++){
               System.out.println(""+i);
               Thread.sleep(2000);
           }
       }catch(Exception e){
        System.out.println(""+e);
    }
    }
    
}
