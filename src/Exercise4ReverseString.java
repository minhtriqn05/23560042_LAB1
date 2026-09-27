import java.util.Scanner;

/**
 * Exercise 4: Reverse a String.
 * Reads a line of text and prints it in reverse order.
 */
public class Exercise4ReverseString {

    // Walks through the string from the last character to the first
    // and appends each character to a StringBuilder.
    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();   // nextLine() keeps spaces

        System.out.println("Reversed string: " + reverseString(text));

        scanner.close();
    }
}
