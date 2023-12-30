package practice_projects;

public class RightRotateArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Number of steps to right rotate
        int steps = 5;

        // Display original array
        System.out.println("Original Array:");
        displayArray(array);

        // Right rotate the array by 5 steps
        rightRotateArray(array, steps);

        // Display rotated array
        System.out.println("\nArray after right rotation by " + steps + " steps:");
        displayArray(array);
    }

    // Function to right rotate an array by 'steps' steps
    private static void rightRotateArray(int[] arr, int steps) {
        int n = arr.length;
        steps = steps % n; // Handle cases where steps are greater than array length

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, n - 1);
    }

    // Function to reverse an array in-place
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to display the contents of an array
    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
