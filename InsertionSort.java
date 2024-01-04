package practice_projects;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        int n = array.length;

        // Traverse through all array elements starting from the second element
        for (int i = 1; i < n; i++) {
            // Pick the current element to be inserted in the sorted sequence
            int key = array[i];
            int j = i - 1;

            // Move elements of the sorted sequence that are greater than key to one position ahead
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Place the key in its correct position in the sorted sequence
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {12, 11, 13, 5, 6};

        // Perform insertion sort
        insertionSort(array);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

