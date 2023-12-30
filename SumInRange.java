package practice_projects;

import java.util.Scanner;

public class SumInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array (n): ");
        int n = scanner.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input range [L, R]
        System.out.print("Enter the value of L (0 <= L <= R <= n-1): ");
        int L = scanner.nextInt();
        System.out.print("Enter the value of R (0 <= L <= R <= n-1): ");
        int R = scanner.nextInt();

        // Validate the range
        if (L < 0 || R >= n || L > R) {
            System.out.println("Invalid range. Make sure 0 <= L <= R <= n-1.");
            return;
        }

        // Find and display the sum of elements in the range [L, R]
        int sumInRange = findSumInRange(arr, L, R);
        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " + sumInRange);
    }

    // Function to find the sum of elements in the range [L, R]
    private static int findSumInRange(int[] arr, int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
