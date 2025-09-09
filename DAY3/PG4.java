//WAP to count no of digits in a number
package DAY3;
import java.util.*;
public class PG4 {
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int digitCount = countDigits(num);
        System.out.println("Number of digits: " + digitCount);
        sc.close();
    }
}
