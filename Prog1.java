package SingleTonClass;

public class Prog1 {
    public int age=20;
    public String name="Sujii";
//private object early creation
    private static Prog1 obj;
    //private constructor
    Prog1(){

    }
//    public factory method
    public Prog1 GetInstance(){
        if(obj==null){
            obj = new Prog1();
        }
        return obj;
    }

    public static void main(String[] args) {
        Prog1 pro=new Prog1();
        Prog1 pro1=new Prog1();
        System.out.println(pro.age);
        System.out.println(pro1.age);

    }

}
