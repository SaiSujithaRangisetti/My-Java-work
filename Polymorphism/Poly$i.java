package OOPs.Polymorphism;

public class Poly$i extends Poly4 {
    int add() {
        return 20;
    }
    public static void main(String[] args) {
        Poly4 obj=new Poly4();
        System.out.println(obj.mul(20,8));
    }
}