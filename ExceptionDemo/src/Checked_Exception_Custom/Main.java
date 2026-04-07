package Checked_Exception_Custom;

/**
 * @author Emranul Hoque
 */


class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Main {
  
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("You are not eligible!");
        } else {
            System.out.println("You are eligible.");
        }
    } 
    public static void main(String[] args) {
        try {
            checkAge(15); 
        } catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}