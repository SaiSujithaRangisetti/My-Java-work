package ExcEption.ExcEptionHandling;

public class Prog3 {
    public static void main(String[] args) {
        int div = 0;
        try{
            div=10/0;
            System.out.println("Welcome Namaste");
        }
        catch(ArithmeticException ae){
            System.out.println("Exception Handled - 1");
        }
        catch (NullPointerException ne){
            System.out.println("Exception Handled - 2");
        }
        catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Exception Handled - 3");
        }
    }
}
