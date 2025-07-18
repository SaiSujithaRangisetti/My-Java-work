package OOPs.Encapsulation;

public class EncaoDriver1 {
    public static void main(String[] args) {
        Encap1 obj=new Encap1();
        obj.setName("Sai Sujitha");
        obj.setAge(20);
        obj.setSalary(200000);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
    }
}
