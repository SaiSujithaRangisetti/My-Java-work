package OOPs.Polymorphism;

public class Poly1 {
    public void display(int a){
        System.out.println("One Parameter"+a);
    }
    public void display(int a,int b){
        System.out.println("Two Parameters"+a+" "+b);
    }
    public void display(String a){
        System.out.println("It is a String"+a);
    }
    public static void main(String[] args) {
        Poly1 obj=new Poly1();
        obj.display(23,89);
        obj.display(23);
        obj.display(" Sujitha");
    }
}
