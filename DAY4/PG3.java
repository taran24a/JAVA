//WAP to find max element from array
package DAY4;
import java.util.Scanner;

public class PG3 {
    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
       
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Maximum element is: "+max);
        sc.close();
    }
}
