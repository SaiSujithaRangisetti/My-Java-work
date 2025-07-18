package Basics;
import java.sql.SQLOutput;
import java.util.*;//importing to Basics Package
public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);//Creation of Object
        //int
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        //byte
        byte x=s.nextByte();
        byte d=s.nextByte();
        System.out.println(x+d);
        //String
        String y=s.nextLine();
        System.out.println(y);
        //double

    }
}
