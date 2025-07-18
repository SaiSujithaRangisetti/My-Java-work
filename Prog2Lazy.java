package SingleTonClass;

public class Prog2Lazy {
    public int age=10;
    public String name="Sujitha";
    private static Prog2Lazy obj=null;
    private Prog2Lazy(){

    }
    public static Prog2Lazy getInstance(){
        if(obj==null){
            obj=new Prog2Lazy();
        }
        return obj;
    }

    public static void main(String[] args) {
        Prog2Lazy obj1=Prog2Lazy.getInstance();
        System.out.println(obj1.name);
    }
}
