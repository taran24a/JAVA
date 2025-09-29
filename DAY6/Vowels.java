// WAP to remove all vowels from  given string using stringbuilderpackage DAY6;

public class Vowels {
    public static void main(String[] args) {
        String str="Hello World";
        StringBuilder sb=new StringBuilder(str);
        for(int i=0; i<sb.length(); i++){
            char ch=sb.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println("String after removing vowels: " + sb);
    }

}
