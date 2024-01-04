package practice_projects;
public class ExponentialSearch {

    public static int exponentialSearch(int[] array, int target) {
        int arrayLength = array.length;

        // If the target is the first element, return its index
        if (array[0] == target) {
            return 0;
        }

        // Find the range for binary search by doubling the index
        int i = 1;
        while (i < arrayLength && array[i] <= target) {
            i *= 2;
        }

        // Perform binary search in the found range
        return binarySearch(array, target, i / 2, Math.min(i, arrayLength - 1));
    }

    public static int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at the mid index
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }

            // If target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        // Example usage (sorted array)
        int[] array = {2, 5, 8, 12, 16, 23, 31, 42, 55};
        int target = 16;

        // Perform exponential search
        int result = exponentialSearch(array, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
