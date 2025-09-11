// WAP to reverse an array using function
package DAY4;
import java.util.Scanner;
public class PG4 {  
    static void reverseArray(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<a.length;i++){
            System.out.print("Enter element "+(i+1)+": ");
            a[i]=sc.nextInt();
        }
        reverseArray(a,0,a.length-1);
        System.out.println("Reversed array is: ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        sc.close();
        
        
        
    }
    
}
