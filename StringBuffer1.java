package Assignment2;

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer sc=new StringBuffer("Welcome");
//        sc.reverse();
//        System.out.println(sc);
//        sc.append(" to FAANG Tech");
//        System.out.println(sc);
//        String s1=sc.toString();
//        sc=new StringBuffer(s1.toUpperCase());
//        sc.insert(7,"VJ");
//        sc.insert(1,10);
        sc.replace(1,3,"FAANGTech");//Start index is Inclusive which is included. End Index in Exclusive which is not included
        System.out.println(sc);

    }
}
