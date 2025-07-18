package Loops;
import java.util.Scanner;
public class InfiniteLooping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int fact=0,ch=0;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                System.out.println("Composite");
                ch=1;
                break;
            }
        }if(ch==0)
            System.out.println("Prime");
    }
}