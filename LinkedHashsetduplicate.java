import java.util.*;

public class LinkedHashsetduplicate {
    public static void main(String[] args) {
    String str="programming";
       Set<Character> set =new LinkedHashSet<>();
       for(int i=0;i<str.length();i++){
           set.add(str.charAt(i));
       }
       
       
       System.out.println(set);

      
    }
}