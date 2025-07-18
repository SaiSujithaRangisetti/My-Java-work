package Assignment2;

public class StringBuffer2 {
    public static void main(String[] args) {
        String s="Hello";
        StringBuilder sb=new StringBuilder(s);
        sb.append(" Welcome");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(1,2));
        System.out.println(sb.reverse());
        System.out.println((sb.substring(2,5)));
        System.out.println(sb.insert(2,'e'));
        System.out.println(sb.charAt(0));
        System.out.println(sb.replace(12,13, " Thank you"));
        String s2=sb.toString();
        System.out.println(s2);
    }
}
