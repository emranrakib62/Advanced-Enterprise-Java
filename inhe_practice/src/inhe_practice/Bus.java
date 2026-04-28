/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inhe_practice;

/**
 *
 * @author Emranul Hoque
 */
public  class Bus  extends Transport{

    
   public  double calculateFare(int distance) {
       return 10*distance;
    }
   
   public void addpassenger(int num){
       System.out.println("pass add:"+num);
   }
   public void addpassenger(int num,double loggage){
       System.out.println(num+""+loggage);
   }

   

   

   
}
