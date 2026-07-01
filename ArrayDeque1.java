import java.util.*;


public class ArrayDeque1 {
    public static void main(String[] args) {
        
        int [] ar={1,2,3,4,5};
        int k=3;
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            ad.addFirst(ar[i]);
        }
        for(int i=k;i<ar.length;i++){
            ad.addLast(ar[i]);
        }
        System.out.println(ad);
    }
}