package Collections.List;

import java.util.*;
public class PrintDetail {
    public static void main(String[] args) {
        UserDetails s = new UserDetails("Sai Sujitha", 20, "Guntur");
        UserDetails sm = new UserDetails("Austin Vikranth", 1, "Guntur");
        List<UserDetails> l1 = new ArrayList<>();
        l1.add(s);
        l1.add(sm);
        for(UserDetails user:l1) {
            System.out.println(user.printName());
            System.out.println(user.printloc());
            System.out.println(user.printage());
        }
    }
}
