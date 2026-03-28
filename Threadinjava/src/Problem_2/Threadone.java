
package Problem_2;


public class Threadone implements Runnable{

  
    public void run() {
      
        int i;
        int a=20;
        for(i=2;i<=a;i=i+2){
            System.out.println("EvenNumber:"+i);
        }
       
    }
    
}
