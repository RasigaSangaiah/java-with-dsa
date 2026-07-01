import java.util.*;


public class reverseusingQueue {
    public static void main(String[] args) {

        Queue <Integer> q=new LinkedList<>();
        Stack <Integer> s=new Stack<>();
        int [] arr={1,2,3,4,5};
        int k=3;
        for(int num:arr){
            q.add(num);
        }
        System.out.println(q);
        for(int i=0;i<k;i++){
            s.push(q.poll());
            
        }
        System.out.println(s);
        while(!s.isEmpty()){
            q.add(s.pop());
        }
         int size = q.size() - k;
        for (int i = 0; i < size; i++) {
            q.add(q.poll());
        }

        // 5. Queue → Array output
        System.out.println("Result:");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}