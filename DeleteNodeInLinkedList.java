package practice_projects;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteNodeInLinkedList {
    Node head;

    // Function to insert a new node at the end of the linked list
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
        }
    }

    // Function to display the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to delete the first occurrence of a key in the linked list
    void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        // If the key is in the head node
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        // Search for the key in the linked list
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If the key is not present
        if (temp == null) {
            System.out.println("Key " + key + " not found in the linked list.");
            return;
        }

        // Unlink the node containing the key
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        DeleteNodeInLinkedList linkedList = new DeleteNodeInLinkedList();

        // Insert elements into the linked list
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);

        System.out.println("Original Linked List:");
        linkedList.display();

        // Delete the first occurrence of key 3
        linkedList.deleteNode(3);

        System.out.println("Linked List after deleting the first occurrence of key 3:");
        linkedList.display();
    }
}

