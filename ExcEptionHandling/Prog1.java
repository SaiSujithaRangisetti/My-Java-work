package ExcEption.ExcEptionHandling;

public class Prog1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }finally {
            System.out.println("We are learning Exceptions through FAANG");
        }

    }
}
