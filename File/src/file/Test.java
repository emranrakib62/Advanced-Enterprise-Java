
package file;


public class Test {
    public static void main(String[] args) {
        threadone t1=new threadone();
        threadtwo t2=new threadtwo ();
        
        Thread s1=new Thread(t1);
        Thread s2=new Thread(t2);
        s1.start();
          s2.start();
        
    }
}
