package practice_projects;

import java.util.Scanner;

//Custom exception class
class CustomException extends Exception {
 public CustomException(String message) {
     super(message);
 }
}

public class CustomExceptionexample {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Example 1: Using throws with a method
         System.out.print("Enter a number: ");
         int number = scanner.nextInt();
         validateNumber(number);

         // Example 2: Using throw to manually throw a custom exception
         if (number < 0) {
             throw new CustomException("Number cannot be negative.");
         }

         System.out.println("Entered number is: " + number);
     } catch (CustomException e) {
         System.err.println("Custom Exception: " + e.getMessage());
     } catch (Exception e) {
         System.err.println("General Exception: " + e.getMessage());
     } finally {
         // Example 3: finally block
         System.out.println("This block always gets executed, regardless of exceptions.");
         scanner.close();
     }
 }

 // Example method 1: Using throws with a method
 private static void validateNumber(int number) throws CustomException {
     if (number == 0) {
         throw new CustomException("Number cannot be zero.");
     }
 }
}


