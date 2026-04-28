
package file;


public class threadone implements Runnable {
    public void run(){
        for(int i=2;i<=20;i=i+2){
            System.out.println(""+i);
        }
    }
}
