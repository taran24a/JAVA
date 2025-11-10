
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class StackList {
    Node top = null;

    // Insert Data
    void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed " + data);
    }

    // Remove Data
    int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return -1;
        }
        int val = top.data;
        top=top.next;
        return val;
    }

    // stack traverse
    void print(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements are:");
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackList stack = new StackList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();

        System.out.println("Popped element: " + stack.pop());
        stack.print();
    }
    
}
