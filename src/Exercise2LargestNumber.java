import java.util.Scanner;

/**
 * Exercise 2: Find the Largest Number.
 * Reads three integers and prints the largest one using if-else.
 */
public class Exercise2LargestNumber {

    // Compares the three numbers with if-else and returns the largest one.
    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest = findLargest(a, b, c);
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
