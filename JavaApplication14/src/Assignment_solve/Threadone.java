
package Assignment_solve;


public class Threadone extends Thread {
    public void run(){
    try{
     
        for(int i = 1;i<=10;i++){
            System.out.println(""+i);
                Thread.sleep(2000);
        }
    
        
    }
catch(Exception e){
    System.out.println(""+e);

}
    } 
}
