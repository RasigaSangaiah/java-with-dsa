import java.util.PriorityQueue;
import java.util.Collections;

public class priorityQExample {
    public static void main(String[] args) {

        // Min Heap (Default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(30);
        pq.add(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("Queue: " + pq);

        // View highest priority (smallest)
        System.out.println("Peek: " + pq.peek());

        // Size
        System.out.println("Size: " + pq.size());

        // Check if empty
        System.out.println("Is Empty: " + pq.isEmpty());

        // Remove highest priority
        System.out.println("Poll: " + pq.poll());
        System.out.println("After Poll: " + pq);

        // Remove using remove()
        System.out.println("Remove: " + pq.remove());
        System.out.println("After Remove: " + pq);

        // Add more elements
        pq.offer(15);
        pq.offer(40);

        System.out.println("Updated Queue: " + pq);

        // Traverse
        System.out.print("Elements: ");
        for (int x : pq) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Remove all elements in priority order
        System.out.print("Priority Order: ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}