package custom_exception;


public class Custom_Exception {

    public static void main(String[] args) {
        int number = 20; 

        try {
            if (number < 0) {
               
                throw new RuntimeException("Number cannot be negative");
            }
            
            System.out.println("Number is valid");

        } catch (RuntimeException e) {
            System.out.println("Exception is caught: " + e.getMessage());
            
        } finally {
            System.out.println("Finally Block");
        }
    }
}