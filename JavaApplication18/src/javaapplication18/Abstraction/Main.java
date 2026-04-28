package javaapplication18.Abstraction;

public class Main {

    public static void main(String[] args) {
        MobileUser mu;

        mu = new Karim();
        mu.sendmsg();
        mu.display();

        mu = new Rahim();
        mu.sendmsg();
        mu.display();
    }
}
