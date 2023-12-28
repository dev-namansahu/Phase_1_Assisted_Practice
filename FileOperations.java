package practice_projects;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class FileOperations {

    public static void main(String[] args) {
        // Specify the file path
        Path filePath = Paths.get("sample.txt");

        // Create a file
        createFile(filePath);

        // Read from the file
        readFromFile(filePath);

        // Update the file
        updateFile(filePath, "Updated content");

        // Read again after updating
        readFromFile(filePath);

        // Delete the file
        deleteFile(filePath);
    }

    // Method to create a file
    private static void createFile(Path filePath) {
        try {
            Files.createFile(filePath);
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.err.println("Error creating file: " + e.getMessage());
        }
    }

    // Method to read from a file
    private static void readFromFile(Path filePath) {
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println("File content:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to update a file
    private static void updateFile(Path filePath, String newContent) {
        try {
            Files.write(filePath, newContent.getBytes(), StandardOpenOption.WRITE);
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.err.println("Error updating file: " + e.getMessage());
        }
    }

    // Method to delete a file
    private static void deleteFile(Path filePath) {
        try {
            Files.delete(filePath);
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.err.println("Error deleting file: " + e.getMessage());
        }
    }
}

