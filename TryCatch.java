package practice_projects;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Example 1: ArithmeticException
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("Result of division: " + result);

            // Example 2: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to get a value from the array: ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);

            // Example 3: NullPointerException
            String text = null;
            System.out.println("Length of the string: " + text.length()); // This line will cause NullPointerException
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        
        } finally {
            // Close resources or perform cleanup in the finally block
            System.out.println("This block always gets executed, regardless of exceptions.");
            scanner.close();
        }
    }
}

