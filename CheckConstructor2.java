package Constructor;
//Constructor overloading
public class CheckConstructor2 {
    private int a;
    private String name;
    private String branch;
    private long b;
    public CheckConstructor2(int a, String name, String branch, long b) {
        this.a = a;
        this.name = name;
        this.branch = branch;
        this.b = b;
        System.out.println("Iam the 1st Constructor");
    }
    public CheckConstructor2(){
        System.out.println("Iam another Constructor");
    }
    public static void main(String[] args) {
        CheckConstructor2 obj=new CheckConstructor2();
        CheckConstructor2 obj1=new CheckConstructor2();//Invocation procedure
    }
}
