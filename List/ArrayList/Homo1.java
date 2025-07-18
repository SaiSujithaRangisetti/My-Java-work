package Collections.List.ArrayList;
import java.util.*;
public class Homo1 {
    public static void main(String[] args) {
        List<String>fav=new ArrayList<>();
        fav.add("Orange");
        fav.add("Dragon Fruit");
        fav.add("Mango");
        fav.add("Guava");
        fav.add("Banana");
        System.out.println(fav.get(1));
        fav.set(1,"Amla");
        fav.remove(3);
        System.out.println(fav);
        fav.removeFirst();
        System.out.println(fav);
        fav.removeLast();
        for(String name:fav){
            System.out.println(name);
        }
        if(fav.contains("Mango"))
            System.out.println("You love mango");
        else
            System.out.println("You dont love mango");
        boolean flag=fav.contains("Banana");
        if(flag)
            System.out.println("Already exists");
        else
            fav.add("Banana");
        System.out.println(fav);
    }
}
