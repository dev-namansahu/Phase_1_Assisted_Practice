package practice_projects;
import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding key-value pairs to the map
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        studentScores.put("David", 88);

        // Displaying the map
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        String studentName = "Bob";
        if (studentScores.containsKey(studentName)) {
            int score = studentScores.get(studentName);
            System.out.println("\n" + studentName + "'s score: " + score);
        } else {
            System.out.println("\n" + studentName + " not found in the map.");
        }

        // Modifying a value
        String studentToUpdate = "Alice";
        if (studentScores.containsKey(studentToUpdate)) {
            int currentScore = studentScores.get(studentToUpdate);
            int newScore = currentScore + 5;
            studentScores.put(studentToUpdate, newScore);
            System.out.println("\nUpdated score for " + studentToUpdate + ": " + newScore);
        }

        // Removing a key-value pair
        String studentToRemove = "David";
        if (studentScores.containsKey(studentToRemove)) {
            studentScores.remove(studentToRemove);
            System.out.println("\n" + studentToRemove + "'s record removed from the map.");
        }

        // Displaying the updated map
        System.out.println("\nUpdated Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }


}
