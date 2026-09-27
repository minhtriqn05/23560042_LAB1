import java.util.Scanner;

/**
 * Exercise 3: Sum of Digits.
 * Reads an integer and prints the sum of its digits.
 */
public class Exercise3SumOfDigits {

    // Repeatedly takes the last digit (number % 10), adds it to the sum,
    // then removes that digit (number / 10) until the number becomes 0.
    // Math.abs() lets the method work for negative numbers too.
    public static int sumOfDigits(long number) {
        int sum = 0;
        while (number != 0) {
            sum += (int) Math.abs(number % 10);
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = scanner.nextLong();

        System.out.println("Sum of digits: " + sumOfDigits(number));

        scanner.close();
    }
}
