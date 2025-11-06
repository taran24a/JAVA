// WAP to reverse the  array using stack.
import java.util.Stack;
import java.util.Scanner;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push 
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }

        // Pop 
        for (int i = 0; i < n; i++) {
            arr[i] = stack.pop();
        }

        // Print 
        System.out.println("Reversed array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
