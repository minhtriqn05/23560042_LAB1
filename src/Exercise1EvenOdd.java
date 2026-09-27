import java.util.Scanner;

/**
 * Exercise 1: Even or Odd Numbers.
 * Prints every number from 1 to n followed by "Even" or "Odd".
 */
public class Exercise1EvenOdd {

    // Returns "Even" if the number is divisible by 2, otherwise "Odd".
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    // Loops from 1 to n and prints "i - Even" or "i - Odd" on each line.
    public static void printEvenOdd(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " - " + checkEvenOdd(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n must be at least 1.");
        } else {
            printEvenOdd(n);
        }

        scanner.close();
    }
}
