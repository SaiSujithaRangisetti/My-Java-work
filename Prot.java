package Package3;
import Package2.Protected;
public class Prot extends Protected {
    public static void main(String[] args) {
        Prot obi=new Prot();
        System.out.println(obi.name);
        System.out.println(obi.age);
        System.out.println(obi.location);
        System.out.println(obi.add(12,88));
    }
}
