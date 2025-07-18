package OOPs.Encapsulation;
//The entire class in known as POJO
public class Encap1 {
    private int age;
    private String name;
    private long salary;
    public void setAge(int a){
        age=a;
    }
    public void setName(String n){
        name=n;
    }
    public void setSalary(long s){
        salary=s;
    }

    public long getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
