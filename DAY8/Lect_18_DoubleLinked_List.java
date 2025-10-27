public class Lect_18_DoubleLinked_List {
    
    class Node {
        int data;
        Node next;
        Node prev;
    }

    Node head = null;
    Node tail = null;

    // Insert at head
    void insertAtHead(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert at tail
    void insertAtTail(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Print list forward
    void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Print list backward
    void printReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Delete first node
    void deleteFirst() {
        if (head == null) return;
        else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete last node
    void deleteLast() {
        if (tail == null) return;
        else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Main function to test
    public static void main(String[] args) {
        Lect_18_DoubleLinked_List dll = new Lect_18_DoubleLinked_List();
        
        dll.insertAtHead(10);
        dll.insertAtTail(20);
        dll.insertAtHead(5);
        dll.insertAtTail(30);

        System.out.print("Forward: ");
        dll.print();            // Output: 5 10 20 30

        System.out.print("Reverse: ");
        dll.printReverse();     // Output: 30 20 10 5

        dll.deleteFirst();
        System.out.print("After deleteFirst: ");
        dll.print();            // Output: 10 20 30

        dll.deleteLast();
        System.out.print("After deleteLast: ");
        dll.print();            // Output: 10 20
    }
}
