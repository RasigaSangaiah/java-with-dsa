import java.util.*;

public class Union&Intersection {
    public static void main(String[] args) {
    HashSet<Integer> h=new HashSet<>();
     HashSet<Integer> h2=new HashSet<>();
     h.add(2);
     h.add(3);
     h.add(4);
     h.add(5);
     
     h2.add(4);
     h2.add(6);
     h2.add(5);
     h2.add(7);
     
    HashSet<Integer> union=new HashSet<>(h);
    union.addAll(h2);
    HashSet<Integer> intersection=new HashSet<>(h);
    intersection.retainAll(h2);
    System.out.println("Set1: "+h);
    System.out.println("Set2:"+h2);
    System.out.println("Union:"+union);
    System.out.println("Intersection:"+intersection);

      
    }
}