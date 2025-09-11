// WAP to take input from user and print it in arrray using for loop
package DAY4;
import java.util.Scanner;


public class PG2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("You entered:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}


        
    
