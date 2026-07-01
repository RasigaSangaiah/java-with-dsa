import java.util.PriorityQueue;
import java.util.Collections;

public class Maxheap{
    public static void main(String[] args) {

        PriorityQueue<String> pq =
                new PriorityQueue<>(Collections.reverseOrder());//thisplace only change for max heap

        pq.add("Banana");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Mango");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}