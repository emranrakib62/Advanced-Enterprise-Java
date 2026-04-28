
package Assignment_solve;


public class Thraedtwo extends Thread {
    
    public void run(){
        try{
         for(int i = 10;i>=1;i--){
            System.out.println(""+i);
          Thread.sleep(3000);
        }
           
        }catch(Exception e){
       System.out.println(""+e);
        }
       
    }
    
}
