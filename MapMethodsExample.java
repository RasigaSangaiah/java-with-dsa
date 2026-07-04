import java.util.*;

public class MapMethodsExample {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        System.out.println("Map: " + map);

        // get()
        System.out.println("get(2): " + map.get(2));

        // containsKey()
        System.out.println("containsKey(3): " + map.containsKey(3));

        // containsValue()
        System.out.println("containsValue(Apple): " + map.containsValue("Apple"));

        // size()
        System.out.println("size(): " + map.size());

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());

        // putIfAbsent()
        map.putIfAbsent(4, "Mango");
        System.out.println("putIfAbsent(): " + map);

        // replace()
        map.replace(2, "Grapes");
        System.out.println("replace(): " + map);

        // getOrDefault()
        System.out.println("getOrDefault(5): " + map.getOrDefault(5, "Not Found"));

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("\nEntry Set");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // forEach()
        System.out.println("\nforEach()");
        map.forEach((k, v) -> System.out.println(k + " -> " + v));

        // remove()
        map.remove(3);
        System.out.println("\nAfter remove(): " + map);

        // clear()
        map.clear();
        System.out.println("After clear(): " + map);

        // isEmpty()
        System.out.println("isEmpty(): " + map.isEmpty());
    }
}