package Loops;

public class DoWhileEvenOdd {
    public static void main(String[] args) {
        int i=1;
        System.out.println("Even");
        while(i<=10){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
        int j=1;
        while(j<=10) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }j++;
        }
    }
}
