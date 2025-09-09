package DAY3;
import java.util.*;
public class PG3 {
    public static int prime(int n){
        if(n<=1){
            return 0;
        }
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(prime(num)==1){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
    
    
}
