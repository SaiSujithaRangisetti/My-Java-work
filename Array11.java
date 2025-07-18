package Arrays;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=a[0];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
    }
}
