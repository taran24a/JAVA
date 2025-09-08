package DAY1;


import java.util.Scanner;

public class PG4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a float: ");
        float b = sc.nextFloat();

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter a string: ");
        String str = sc.next();
        sc.nextLine();  // Consume the newline character

        System.out.print("Enter a boolean: ");
        boolean flag = sc.nextBoolean();

        System.out.println("Boolean: flag = "+flag);
        System.out.println("Integer: a = "+a);
        System.out.println("Float: b = "+b);
        System.out.println("Character: c = "+c);
        System.out.println("String: str = "+str);

        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        
    }
    
}
