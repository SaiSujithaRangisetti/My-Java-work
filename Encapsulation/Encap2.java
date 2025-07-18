package OOPs.Encapsulation;

public class Encap2 {
    private int age;
    private String name;
    private long salary;
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(long salary){
        this.salary=salary;
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
