import java.util.Stack;

public class letteronly {
    public static void main(String[] args) {

        String str = "he3ll4o";
        Stack<Character> stack = new Stack<>();

        // Push only characters into stack
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                stack.push(ch);
            }
        }

        // Print characters
        for (char ch : stack) {
            System.out.print(ch);
        }
    }
}