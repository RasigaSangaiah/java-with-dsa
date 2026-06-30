import java.util.Stack;

public class SameRemoveinStack {
    public static void main(String[] args) {

        String str = "pqqprs";
        Stack<Character> stack = new Stack<>();

        // Push only characters into stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if(!stack.isEmpty()&&stack.peek()==ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
            
        }

        // Print characters
        for (char ch : stack) {
            System.out.print(ch);
        }
    }
}