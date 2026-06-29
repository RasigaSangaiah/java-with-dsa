import java.util.*;
class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("add list"+list);
        System.out.println("get insex1:"+list.get(1));
        list.set(2,80);
        System.out.println("add list"+list);
         list.add(60);
        list.add(50);
        System.out.println("size list:"+list.size());
        System.out.println("add list"+list);
        list.remove(2);
        System.out.println("remove list"+list);
        System.out.println("Index of 50: " + list.indexOf(50));
        System.out.println("Contains " + list.contains(20));
        System.out.println("Is Empty? " + list.isEmpty());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }
        list.clear();
        System.out.println("After clear Is Empty? " + list.isEmpty());
        System.out.println(list);



        
    }
}