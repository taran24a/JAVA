// WAP for sum of digits of a number
package DAY2;
import java.util.*;
public class PG4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
    
}
