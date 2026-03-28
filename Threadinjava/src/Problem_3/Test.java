
package Problem_3;


public class Test {
    public static void main(String[] args) {
        Threadone one=new Threadone();
        Threadtwo two=new Threadtwo();
        one.start();
        two.start();
    }
}
