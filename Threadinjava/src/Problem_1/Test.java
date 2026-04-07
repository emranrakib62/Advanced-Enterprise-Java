
package Problem_1;

public class Test {

    public static void main(String[] args) {
        
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        t1.start();
        t2.start();
        
    }
    
}
