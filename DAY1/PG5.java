
import java.util.Scanner;
public class PG5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);

        System.out.println(n++);
        System.out.println(++n);
        sc.close();
    }
    
}
