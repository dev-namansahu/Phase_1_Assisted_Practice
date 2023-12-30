package practice_projects;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListTraversal {
    Node head;

    // Function to insert a new node at the end of the doubly linked list
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    // Function to traverse the doubly linked list in the forward direction
    void forwardTraversal() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        System.out.println("Forward Traversal:");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Function to traverse the doubly linked list in the backward direction
    void backwardTraversal() {
        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        System.out.println("Backward Traversal:");
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListTraversal doublyList = new DoublyLinkedListTraversal();

        // Insert elements into the doubly linked list
        doublyList.insert(1);
        doublyList.insert(2);
        doublyList.insert(3);
        doublyList.insert(4);

        // Traverse the doubly linked list in the forward direction
        doublyList.forwardTraversal();

        // Traverse the doubly linked list in the backward direction
        doublyList.backwardTraversal();
    }
}
