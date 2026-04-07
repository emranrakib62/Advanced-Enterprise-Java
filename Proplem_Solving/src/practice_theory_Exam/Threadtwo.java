/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice_theory_Exam;

/**
 *
 * @author Emranul Hoque
 */
public class Threadtwo implements Runnable{
    public void run(){
        try{
            for(int i=10;i>=1;i--){
                System.out.println(""+i);
                Thread.sleep(2000);
                        }
            }catch(Exception e){
                    
                e.printStackTrace();
                    }
        }
    }
    

