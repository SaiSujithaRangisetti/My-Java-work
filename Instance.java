package Basics;

public class Instance {
    int a,b;
    char ch;
     int add() {
        return a+b;
    }
    public static void main(String[] args) {
         Instance obj = new Instance();
        System.out.println(obj.a);
        System.out.println(obj.ch);
    }
}
