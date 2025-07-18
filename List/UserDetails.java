package Collections.List;

public class UserDetails {
    String n1;
    int age;
    String loc;

    public UserDetails(String n1, int age, String loc) {
        this.n1 = n1;
        this.age = age;
        this.loc = loc;
    }

    public String printName() {
        return n1;
    }
    public int printage(){
        return age;
    }
    public String printloc(){
        return loc;
    }
}
