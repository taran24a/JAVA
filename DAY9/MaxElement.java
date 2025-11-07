// WAP to find max element in an array using stack.
// Custom Stack for integers
class Stack {
    int top;
    int capacity;
    int[] a;

    Stack(int size) {
        capacity = size;
        a = new int[size];
        top = -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            a[++top] = x;
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return a[top--];
    }
}

public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 9, 1, 6};
        int max = findMax(arr);
        System.out.println("Maximum element in the array is: " + max);
    }

    static int findMax(int[] arr) {
        Stack s = new Stack(arr.length);

        // Push all elements into stack
        for (int num : arr) {
            s.push(num);
        }

        // Pop and find max
        int max = Integer.MIN_VALUE;

        while (!s.isEmpty()) {
            int current = s.pop();
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
