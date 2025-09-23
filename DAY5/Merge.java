// merge sort using function
package DAY5;
import java.util.Scanner;
 public class Merge{
	static void mergesort(int a[],int low,int high)
	{
		if(low<high){
			int mid=(low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			Merge.merge(a,low,mid,high);
        }
    }
    static void merge(int a[],int low,int mid,int high)
    {
        int i=low,j=mid+1,k=low;        
        int b[]=new int[20];
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
                b[k++]=a[i++];
            else
                b[k++]=a[j++];
        }
        while(i<=mid)
            b[k++]=a[i++];
        while(j<=high)
            b[k++]=a[j++];
        for(i=low;i<=high;i++)
            a[i]=b[i];
    }
    static void display(int a[])
    {
        System.out.println("Sorted array is:");
        for(int i:a)
            System.out.print(i+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        mergesort(a,0,n-1);
        display(a);
    }

}
