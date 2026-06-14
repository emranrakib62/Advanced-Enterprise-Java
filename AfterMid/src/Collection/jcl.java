
package Collection;

import java.util.*;

public class jcl {
    public static void main(String[] args) {
        
        
        
        List<Integer> n=new ArrayList<>();
        n.add(10);
        n.add(10);        
        System.out.println("After Add:"+n);           
        n.set(0, 60);
        n.set(1, 60);
        System.out.println("After update:"+n);
        
        
       
              
              
              Map<Integer,String> n3=new HashMap<>();
              n3.put(409, "Java");              
                System.out.println("After Add"+n3);               
                n3.remove(409);
                System.out.println("After Remove"+n3);                
                  n3.put(409, "Advanced Enterprise Java");
                  System.out.println("After update:"+n3);
                
                
                
                
                
                
                
                
                
                
                
              
              
              
              
                
        
    }
}
