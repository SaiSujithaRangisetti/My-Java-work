package OOPs.Polymorphism;

public class Poly4 {
    public int add(int a){
        return a;
    }

    public String add(String name, String middleName, String lastName){
        return name + middleName + lastName;
    }

    public static void display() {
        for(int i=1; i<=10; i++)
            System.out.println(i);
    }
    public int mul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Poly4 obj = new Poly4();
        System.out.println(obj.add(10));
        display();
        System.out.println(obj.add("Sai ", "Sujitha ", "Rangisetti"));
    }
}
