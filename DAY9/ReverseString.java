// reverse a string using stack but dont use inbuilt stack class
// Custom Stack (no inbuilt Stack class)
class Stack {
    int top;
    int capacity;
    char[] a;

    Stack(int size) {
        capacity = size;
        a = new char[size];
        top = -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(char c) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            a[++top] = c;
        }
    }

    char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return '\0';
        }
        return a[top--];
    }
}

public class ReverseString {

    public static void main(String[] args) {
        String str = "hello";
        int n = str.length();

        Stack s = new Stack(n);

        // Push all characters
        for (int i = 0; i < n; i++) {
            s.push(str.charAt(i));
        }

        // Pop into reversed string
        String rev = "";
        while (!s.isEmpty()) {
            rev += s.pop();
        }

        System.out.println("Reversed string: " + rev);
    }
}
