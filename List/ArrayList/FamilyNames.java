package Collections.List.ArrayList;

import java.util.*;

public class FamilyNames {
    public static void main(String[] args) {
        List fam =new ArrayList();
        fam.add("Nageswar Rao");
        fam.add("Durgamma");
        fam.add("Murali Krishna");
        fam.add("Lakshmi Rajyam");
        fam.add("Poojitha");
        fam.add("Sai Sujitha");
        fam.add("Devi Sri");
        for(int i=0;i<fam.size();i++)
            System.out.print(fam.get(i)+",");
        System.out.println();
        System.out.println("Second Loop");
        for (Object name : fam) {
            System.out.print(name+",");
        }
    }
}
