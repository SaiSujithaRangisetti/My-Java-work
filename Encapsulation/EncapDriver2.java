package OOPs.Encapsulation;

public class EncapDriver2 {
    public static void main(String[] args) {
        Encap2 obj=new Encap2();
        obj.setAge(20);
        obj.setName("Lilly");
        obj.setSalary(200000);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getSalary());
    }
}
