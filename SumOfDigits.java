public class SumOfDigits {

    static int sumDigits(int n) {
        if (n == 0) {      // Base case
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);   // Recursive call
    }

    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Sum of digits = " + sumDigits(num));
    }
}