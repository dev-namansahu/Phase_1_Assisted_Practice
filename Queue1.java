package practice_projects;
import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        // Creating a queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements into the queue
        System.out.println("Enqueuing elements into the queue:");
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Display the queue
        displayQueue(queue);

        // Dequeue elements from the queue
        System.out.println("\nDequeuing elements from the queue:");
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);

        // Display the queue after dequeue operation
        displayQueue(queue);
    }

    // Function to display the elements of the queue
    private static void displayQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Queue elements:");
        for (int element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
