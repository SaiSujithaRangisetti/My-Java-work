package Collections.List.ArrayList;

import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        List l1=new ArrayList();
        //creating the data in l1.add
        l1.add("Nageswar Rao");//Create
        l1.add("Durgamma");
        l1.add("Murali Krishna");
        l1.add("Lakshmi Rajyam");
        l1.add(49);
        l1.add(63);
        l1.add(4);
        l1.add("Puppy");
        System.out.println(l1.get(4));//Read
        l1.set(4,"Poojitha");//Update
        System.out.println(l1.get(4));
        System.out.println(l1.get(7));
        l1.remove(7);//delete
        System.out.println(l1);
        l1.clear();//delete
        System.out.println(l1);
    }
}
