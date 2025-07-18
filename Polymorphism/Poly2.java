package OOPs.Polymorphism;

public class Poly2 {
    public int add(int a){
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }
    public String add(String name,String middleName, String lastName){
        return name+middleName+lastName;
    }
    public static void main(String[] args) {
        Poly2 obj=new Poly2();
        System.out.println(obj.add(10));
        System.out.println(obj.add(10,60));
        System.out.println(obj.add("Sai ","Sujitha ","Rangisetti"));
    }
}
