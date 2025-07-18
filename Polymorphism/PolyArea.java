package OOPs.Polymorphism;

import java.util.Scanner;

public class PolyArea {
    public int area(int side){
        return side*side;
    }
    public int area(int len,int bred){
        return len*bred;
    }
    public double area(double rad){
        return 3.14*rad*rad;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int len=sc.nextInt();
        int bred=sc.nextInt();
        double rad=sc.nextDouble();
        PolyArea obj=new PolyArea();
        System.out.println(obj.area(side));
        System.out.println(obj.area(len,bred));
        System.out.println(obj.area(rad));
    }
}
