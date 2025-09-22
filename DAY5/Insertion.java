// insertion sort
package DAY5;
import java.util.Scanner;
public class Insertion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
        	int key=arr[i];
        	int j=i-1;
        	while(j>=0 && arr[j]>key)
        	{
        		arr[j+1]=arr[j];
        		j--;
        	}
        	arr[j+1]=key;
        }
        System.out.println("Sorted array");
        for(int i=0;i<n;i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();


    }
    public static void insertionSort(int arr[])
    {
    {
    	int n = arr.length;
    	for(int i=1;i<n;i++)
    	{
        	int key=arr[i];
        	int j=i-1;
        	while(j>=0 && arr[j]>key)
        	{
        		arr[j+1]=arr[j];
        		j--;
        	}
        	arr[j+1]=key;
        }
    }

    }
}

