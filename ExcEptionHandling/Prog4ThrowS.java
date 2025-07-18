package ExcEption.ExcEptionHandling;

public class Prog4ThrowS {
    public static void main(String[] args)throws ArithmeticException {
        int a=10;
        int b=0;
            if (b == 0) {
                // Explicitly throwing an exception (using 'throw')
                throw new ArithmeticException("Division by zero is not allowed!");
            }
        System.out.println(a/b);
        }
    }

