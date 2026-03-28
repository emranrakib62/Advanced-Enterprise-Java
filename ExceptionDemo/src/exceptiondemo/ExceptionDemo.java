
package exceptiondemo;


public class ExceptionDemo {

   
    public static void main(String[] args) {
       try{
           String a=null;
           System.out.println(""+a.length());
       }catch(NullPointerException e1){
           System.out.println("Exception:"+e1);
           
       }
       
       
       finally{
           System.out.println("this is arithmatic Exception");
       }
        
        
        
        
        
        
        
    }
    
}
