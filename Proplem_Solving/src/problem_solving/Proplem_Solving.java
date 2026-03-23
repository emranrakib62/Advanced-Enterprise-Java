
package problem_solving;

import java.util.Scanner;
public class Proplem_Solving {

    
    public static void main(String[] args) {
        // TODO code application logic here
    
        while(true){
            
            
            try{
            Scanner input=new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int n1=input.nextInt();
    
        System.out.println("Enter the number2: ");
        int n2=input.nextInt();
    
    int result=n1/n2;
        System.out.println("rESULT:"+result);
    
        }catch(Exception e){
            
            System.out.println("Exception:"+e);
            System.out.println("You must Enter Integer.Please Try Again");
            
        }
    
        } 
        
    }
    
}
