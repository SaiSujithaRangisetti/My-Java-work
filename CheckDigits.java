package Loops;

public class CheckDigits {
    public static void main(String[] args) {
        int a = 196;
        int b = 233;
        int sumA = 0;
        int sumB = 0;
        int tempA = a;
        int tempB = b;
        while (tempA > 0) {
            sumA += tempA % 10;
            tempA /= 10;
        }
        while (tempB > 0) {
            sumB += tempB % 10;
            tempB /= 10;
        }
        System.out.println(sumA);
        System.out.println(sumB);
    }
}
