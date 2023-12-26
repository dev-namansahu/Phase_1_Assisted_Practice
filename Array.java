package practice_projects;

public class Array {
	public static void main(String[] args) {
        // Declaration and Initialization of an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Accessing and printing elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // Move to the next line

        // Modifying an element of the array
        numbers[2] = 10;

        // Displaying the modified array
        System.out.println("\nModified array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Move to the next line

        // Declaration and Initialization of an array of strings
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        // Accessing and printing elements of the string array
        System.out.println("\nNames in the array:");
        for (String name : names) {
            System.out.println(name);
        }

        // Multi-dimensional array (2D array)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing and printing elements of the 2D array
        System.out.println("\nElements of the 2D array:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
