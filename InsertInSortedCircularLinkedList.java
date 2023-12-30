package practice_projects;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertInSortedCircularLinkedList {
    Node head;

    // Function to insert a new node into a sorted circular linked list
    void insert(int newData) {
        Node newNode = new Node(newData);

        // If the list is empty, make the new node the head and point to itself
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node current = head;

            // If the new node is smaller than the head, insert it at the beginning
            if (newData < current.data) {
                while (current.next != head) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.next = head;
                head = newNode;
            } else {
                // Find the correct position to insert the new node
                while (current.next != head && current.next.data < newData) {
                    current = current.next;
                }

                // Insert the new node
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

    // Function to display the circular linked list
    void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        InsertInSortedCircularLinkedList circularList = new InsertInSortedCircularLinkedList();

        // Insert elements into the sorted circular linked list
        circularList.insert(1);
        circularList.insert(3);
        circularList.insert(5);

        System.out.println("Original Sorted Circular Linked List:");
        circularList.display();

        // Insert a new element (e.g., 4)
        circularList.insert(4);

        System.out.println("Sorted Circular Linked List after inserting 4:");
        circularList.display();
    }
}

