
package file;


public class threadtwo implements Runnable{
    public void run(){
        for(int i=1;i<=20;i=i+2){
            System.out.println(""+i);
        }

    }
}
