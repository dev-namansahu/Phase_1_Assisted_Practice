package practice_projects;

public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array, and get the index of the pivot element
            int partitionIndex = partition(array, low, high);

            // Recursively sort the sub-arrays on both sides of the pivot
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        // Choose the rightmost element as the pivot
        int pivot = array[high];

        // Index of the smaller element
        int i = low - 1;

        // Traverse through the array and rearrange elements
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                // Swap array[i] and array[j]
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap array[i + 1] and array[high] to place the pivot in its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the index of the pivot element
        return i + 1;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {64, 25, 12, 22, 11};

        // Perform quicksort
        quickSort(array, 0, array.length - 1);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
