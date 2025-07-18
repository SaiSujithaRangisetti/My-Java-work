package OOPs.Polymorphism;

public class Poly3 {
    public int add(int a){
        return a;
    }
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a,String b,String c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Poly3 obj=new Poly3();
        System.out.println(obj.add(20));
        System.out.println(obj.add(20,78));
        System.out.println(obj.add("Chalapathi"," Java"," Batch"));
    }
}
