package Assignment2;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("vj");
        System.out.println(sb);
        String s1 = sb.toString();
        s1 = s1.toUpperCase();
        sb = new StringBuilder(s1);
        System.out.println(sb);
    }
}
