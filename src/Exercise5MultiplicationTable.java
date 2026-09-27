import java.util.Scanner;

/**
 * Exercise 5: Multiplication Table.
 * Reads an integer n and prints n x 1 up to n x 10.
 */
public class Exercise5MultiplicationTable {

    // Loops i from 1 to 10 and prints one line "n x i = n*i" per step.
    // The product is computed as long to avoid int overflow for large n.
    public static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            long product = (long) n * i;
            System.out.println(n + " x " + i + " = " + product);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        printMultiplicationTable(n);

        scanner.close();
    }
}
