package OOPs.Encapsulation;

public class EncapDriver{
    public static void main(String[] args) {
        Encap obj=new Encap();
        obj.setAge(20);
        obj.setName("Sujitha");
        obj.setLocation("Guntur");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
        System.out.println(obj.getLocation());
    }
}
