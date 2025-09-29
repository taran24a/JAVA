public class Stringrev {
    public static String Reverse(String str){
        //Method 1
        // String rev="";
        // int l=str.length();
        // for(int i=0; i<l; i++){
        //     rev=str.charAt(i)+rev;
        // }
        // return rev;

        //Method 2
        char ch[]=str.toCharArray();
        int s=0, l = ch.length-1;
        while(s<l){
            char temp=ch[s];
            ch[s]=ch[l];
            ch[l]=temp;
            s++;
            l--;
        }
        return new String(ch);
    }
    public static void main(String[] args){
        // String str="Java Programming";
        // System.out.println("String length =  "+str.length());
        // System.out.println("Character at index 2 = "+str.charAt(2));
        // String substr = str.substring(0,6);
        // System.out.println("Substring = "+substr);

        // String str = "React.js is the best frontend framework";
        // System.out.println("Original String = "+str);
        // System.out.println("After upper case = "+str.toUpperCase());

        // String company = "Facebook,Amazon,Netflix,Google";
        // String res[]=company.split(",");
        // for(String x:res){
        //     System.out.println(x);
        // }

        System.out.println(Reverse("Hello World"));
    }
}