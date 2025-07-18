package SingleTonClass;

public class Prog2 {
    public int age=10;
    public String name="Sujitha";
    private static final Prog2 obj=new Prog2();
    private Prog2() {

    }
    public static Prog2 getInstance(){
        return obj;
    }
    //SingleTon Early Initialization
    public static void main(String[] args) {

    }
}
