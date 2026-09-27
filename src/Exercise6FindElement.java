import java.util.Scanner;

/**
 * Exercise 6: Find an Element in an Array.
 * Prints the index (0-based) of the first occurrence of x, or -1 if x is not found.
 */
public class Exercise6FindElement {

    // Reads 'size' integers from the scanner into a new array.
    public static int[] readArray(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Linear search: checks each element from left to right and returns
    // the first index where arr[i] == x. Returns -1 if no element matches.
    public static int findFirstIndex(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements n: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.print("Enter " + n + " integers: ");
        }
        int[] arr = readArray(scanner, n);

        System.out.print("Enter the number to search x: ");
        int x = scanner.nextInt();

        System.out.println("Result: " + findFirstIndex(arr, x));

        scanner.close();
    }
}
