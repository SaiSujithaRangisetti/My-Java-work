package OOPs.Polymorphism;

public class MPoly1 {
    void sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog1 extends MPoly1{
    void sound(){
        System.out.println("Bow Bow");
    }
}
class Dog extends MPoly1 {
    void sound() {
        System.out.println("Dog Barks");
    }
    public static void main(String[] args) {
        Dog1 obj=new Dog1();
        obj.sound();
    }
}
