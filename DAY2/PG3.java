// WAP to print multiplication table of a number n entered by the user
package DAY2;
import java.util.*;


public class PG3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(n + " X " + (i) + " = " + n*i);
        }
          sc.close();
    }
  
    
}
