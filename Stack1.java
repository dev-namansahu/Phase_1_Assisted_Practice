package practice_projects;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Insert (push) elements into the stack
        System.out.println("Pushing elements onto the stack:");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the stack
        displayStack(stack);

        // Remove (pop) elements from the stack
        System.out.println("\nPopping elements from the stack:");
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the stack after popping
        displayStack(stack);
    }

    // Function to display the elements of the stack
    private static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}
