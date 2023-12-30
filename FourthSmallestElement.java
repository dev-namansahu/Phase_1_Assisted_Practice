package practice_projects;

import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        // Example unsorted list
        int[] unsortedList = {9, 2, 5, 1, 8, 4, 7, 6, 3};

        // Find the fourth smallest element
        int fourthSmallest = findFourthSmallestElement(unsortedList);

        // Display the result
        System.out.println("Fourth Smallest Element: " + fourthSmallest);
    }

    // Function to find the fourth smallest element in an unsorted list
    private static int findFourthSmallestElement(int[] arr) {
        if (arr.length < 4) {
            System.out.println("List does not have at least four elements.");
            return -1; // Return -1 to indicate an error or absence of the fourth smallest element
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the fourth element (index 3 since arrays are zero-indexed)
        return arr[3];
    }
}
