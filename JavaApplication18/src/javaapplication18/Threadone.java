
package javaapplication18;


public class Threadone implements Runnable {
    
    
    public void run(){
        try{
            for(int i=1;i<=20;i++){
    System.out.println(i);
    Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(""+e);
                }
            
    

       
        
    }
    
    
    
    }

