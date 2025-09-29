public class Builder {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb);
        sb.replace(0,5,"Hi");
        System.out.println(sb);
        sb.delete(2,5);
        System.out.println(sb);
        sb.insert(2," everyone");
        System.out.println(sb);
        System.out.println("Length = "+sb.length());
        System.out.println("Character at index 5 = "+sb.charAt(5));
        String s=sb.toString();
        System.out.println(s);
        System.out.println("Capacity = "+sb.capacity());
        System.out.println(sb.reverse());
        System.out.println(sb.substring(2,5));

    }
}
