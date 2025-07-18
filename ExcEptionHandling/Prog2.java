package ExcEption.ExcEptionHandling;

public class Prog2 {
    public static void main(String[] args) {
        int div=0;
        try{
            div=10/0;
            System.out.println("Welcome");
        }
        catch (Exception e){
            System.out.println("Exception Handled");
        }
    }
}
