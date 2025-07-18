package Collections.Set.Hash;

public class Hashing {
    public static void main(String[] args) {
        String name = "HelloHash";
        Boolean flag=false;
        Integer i=20;

        System.out.println(name.hashCode()%16);
        System.out.println(flag.hashCode());
        System.out.println(i.hashCode());
    }
}
