package DAY3;

public class PG6 {
    
    static void print(int n){
        if(n>3){
            return;
        }
        print(n+1);
        System.out.println(n);
        
    }
    public static void main(String args[]){
        int n=1;
        print(n);
    }
}
    

