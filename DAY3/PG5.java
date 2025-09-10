package DAY3;


public class PG5 {
    public static void print(int n){
            if(n>3)
            return;
            System.out.println(n);
            print(n+1);}
    public static void main(String[] args) {
        
        int n =1;
        print(n);
        }
    }
    

