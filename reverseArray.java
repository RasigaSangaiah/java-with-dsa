import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n=7;

        Stack <Integer> s=new Stack<>();
        ArrayDeque <Integer> q=new ArrayDeque<>();
        for(int i=0;i<n-k;i++){
            q.addLast(arr[i]);
        }
        for(int i=n-k;i<n;i++){
            s.push(arr[i]);
        }
        while(!s.isEmpty()){
            q.addLast(s.pop());
        }
        while (!q.isEmpty()){
            System.out.println(q.pollFirst()+" ");
        }

      
    }
}