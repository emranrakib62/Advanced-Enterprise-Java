package Collection;
import java.util.*;
public class javacollection {
    public static void main(String[] args) {
        //List      
        List<String> n = new ArrayList<>();
        n.add("A");
        n.add("B");
        n.add("C");
        n.add("D");
        n.add("C");
        n.add("E");
        System.out.println("after Add:" + n);
        n.remove(5);
        System.out.println("after remove:" + n);
        n.set(0, "Z");
        System.out.println("after update:" + n);
        
        //Set
        Set<String> n1 = new HashSet<>();
        n1.add("A");
        n1.add("B");
        n1.add("C");
        n1.add("D");
        n1.add("C");
        n1.add("E");
        System.out.println("after Add:" + n1);
        n1.remove("D");
        System.out.println("after remove:" + n1);

        //Queue      
        Queue<String> n2 = new LinkedList<>();
        n2.add("A");
        n2.add("B");
        n2.add("C");
        n2.add("D");
        n2.add("C");
        n2.add("E");
        System.out.println("after Add:" + n2);
        //follow FiFo
        n2.poll();
        System.out.println("after remove:" + n2);
        n2.peek();
        System.out.println("Peek element: " + n2.peek());

        //Map       
        Map<Integer, String> n3 = new HashMap<>();
        n3.put(1, "A");
        n3.put(2, "B");
        n3.put(3, "C");
        System.out.println("After Add:" + n3);
        n3.remove(3);
        System.out.println("After remove:" + n3);
        n3.put(2, "Z");
        System.out.println("After updating: " + n3);
    }

}
