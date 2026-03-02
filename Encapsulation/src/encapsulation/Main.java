
package encapsulation;


public class Main {
    
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Rakib");
        p1.getName();
        p1.setAge(10);
        p1.getAge();
        
        System.out.println("name:"+ p1.getName());
        System.out.println("age:"+ p1.getAge());
        
    }
    
    
}
