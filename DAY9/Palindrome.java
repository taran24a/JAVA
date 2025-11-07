// WAP to check if a string is a palindrome using stack


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

public class Palindrome {

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    static boolean isPalindrome(String str) {
        int n = str.length();
        Stack s = new Stack(n);

        // Push all characters onto stack
        for (int i = 0; i < n; i++) {
            s.push(str.charAt(i));
        }

        // Pop characters and compare with original string
        for (int i = 0; i < n; i++) {
            if (s.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
