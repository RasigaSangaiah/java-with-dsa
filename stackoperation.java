// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Stackoperation {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stach"+stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}