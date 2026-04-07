
package Uncheck_Exception_Custom_Amader;

public class Main {
    public static void main(String[] args) {
   int number = -20;

//int number = 20;
try{

if (number < 0) {
throw new MyException("Number cannot be negative");
}
System.out.println("Number is valid");
} catch(MyException e){
System.out.println(" Exception is caught");
} finally{
System.out.println("This is final");
}
}
    }

