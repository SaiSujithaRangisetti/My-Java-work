package Constructor;
public class CheckConstructor1 {
    private int a;
    private String name;
    private String branch;
    private long b;
    public CheckConstructor1(int a, String name, String branch, long b) {
        this.a = a;
        this.name = name;
        this.branch = branch;
        this.b = b;
    }
    public static void main(String[] args) {
        CheckConstructor1 obj=new CheckConstructor1(63,"Sujitha","CSIT",540000);
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(obj.branch);
        System.out.println(obj.b);
    }
}