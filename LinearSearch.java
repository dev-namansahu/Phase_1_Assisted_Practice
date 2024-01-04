package practice_projects;

public class LinearSearch {

    public static int linearSearch(int[] array, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // If the current element is equal to the target, return its index
            if (array[i] == target) {
                return i;
            }
        }
        // If the target is not found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {10, 25, 7, 42, 15, 8, 18};
        int target = 15;

        // Perform linear search
        int result = linearSearch(array, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
