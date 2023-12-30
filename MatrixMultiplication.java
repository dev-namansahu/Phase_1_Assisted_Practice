package practice_projects;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows in the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int cols1 = scanner.nextInt();

        // Input dimensions of the second matrix
        System.out.print("Enter the number of rows in the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Columns of the first matrix must be equal to rows of the second matrix.");
            return;
        }

        // Input elements of the first matrix
        System.out.println("Enter elements of the first matrix:");
        int[][] matrix1 = inputMatrix(rows1, cols1, scanner);

        // Input elements of the second matrix
        System.out.println("Enter elements of the second matrix:");
        int[][] matrix2 = inputMatrix(rows2, cols2, scanner);

        // Multiply matrices
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant Matrix after multiplication:");
        displayMatrix(resultMatrix);
    }

    // Function to input matrix elements
    private static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Function to multiply two matrices
    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
