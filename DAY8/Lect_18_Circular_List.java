public class Lect_18_Circular_List {

    class Node {
        int data;
        Node next;
    }

    Node head = null;
    Node tail = null;

    void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    void insertAtHead(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // Making it circular
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // Update tail's next to new head
        }
    }
    void insertAtTail(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(head==null){
            head=tail=newNode;
            tail.next=head;//making it circular
        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;//update tail's next to new head
        }
    }
    public static void main(String[] args) {
        Lect_18_Circular_List list = new Lect_18_Circular_List();
        list.insertAtHead(5);
        list.display();
    }

    

}
