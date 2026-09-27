import java.util.Scanner;

/**
 * Exercise 7: Merge Two Sorted Arrays.
 * Reads two arrays sorted in ascending order and prints one merged sorted array.
 */
public class Exercise7MergeSortedArrays {

    // Reads 'size' integers from the scanner into a new array.
    public static int[] readArray(Scanner scanner, int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Two-pointer merge: i walks through a, j walks through b.
    // At each step the smaller of a[i] and b[j] is copied into the result.
    // When one array runs out, the rest of the other array is copied over.
    public static int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }
        while (i < a.length) {
            result[k++] = a[i++];
        }
        while (j < b.length) {
            result[k++] = b[j++];
        }
        return result;
    }

    // Prints all elements on one line, separated by spaces.
    public static void printArray(int[] arr) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                line.append(' ');
            }
            line.append(arr[i]);
        }
        System.out.println(line);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n (size of the first sorted array): ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.print("Enter " + n + " sorted integers: ");
        }
        int[] first = readArray(scanner, n);

        System.out.print("Enter m (size of the second sorted array): ");
        int m = scanner.nextInt();
        if (m > 0) {
            System.out.print("Enter " + m + " sorted integers: ");
        }
        int[] second = readArray(scanner, m);

        System.out.print("Merged sorted array: ");
        printArray(mergeSortedArrays(first, second));

        scanner.close();
    }
}
