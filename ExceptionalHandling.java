package practice_projects;

import java.util.Scanner;

public class ExceptionalHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Example 1: ArithmeticException
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();
            int result = divide(10, divisor);
            System.out.println("Result of division: " + result);

            // Example 2: ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.print("Enter an index to get a value from the array: ");
            int index = scanner.nextInt();
            int value = getValueAtIndex(numbers, index);
            System.out.println("Value at index " + index + ": " + value);

            // Example 3: NullPointerException
            String text = null;
            System.out.println("Length of the string: " + getStringLength(text)); // This line will cause NullPointerException
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("General Exception: " + e.getMessage());
        } finally {
            // Example 4: finally block
            System.out.println("This block always gets executed, regardless of exceptions.");
            scanner.close();
        }
    }

    // Example method 1: ArithmeticException
    private static int divide(int dividend, int divisor) {
        return dividend / divisor;
    }

    // Example method 2: ArrayIndexOutOfBoundsException
    private static int getValueAtIndex(int[] array, int index) {
        return array[index];
    }

    // Example method 3: NullPointerException
    private static int getStringLength(String text) {
        return text.length();
    }
}
