import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean palindrome = true;

        // Compare original string with stack
        for (int i = 0; i < str.length(); i++) {

            char ch = stack.pop();

            if (str.charAt(i) != ch)   {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}