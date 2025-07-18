package Methods;

public class Arith {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 60));
        System.out.println(sub(30, 2));
        Arith ob = new Arith();
        System.out.println(ob.mul(30, 8));
        System.out.println(ob.div(34, 2));
        System.out.println(ob.mod(209, 89));
    }
}
