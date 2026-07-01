import java.util.PriorityQueue;
//Min heap and priority queue is same
public class Minheap {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Banana");
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Mango");
        pq.add("10");

        System.out.println("Queue: " + pq);

        System.out.println("Peek: " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}