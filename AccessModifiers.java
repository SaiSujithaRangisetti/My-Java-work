package Package3;

public class AccessModifiers {
    private String courseName="CSIT";
    private int courseFee=300000;
    private String courseSubject="JAVA";
    private int add(int a,int b) {
        return a + b;
    }
    public static void main(String[] args) {
        AccessModifiers obj=new AccessModifiers();
        System.out.println(obj.courseName);
        System.out.println(obj.courseFee);
        System.out.println(obj.courseSubject);
        System.out.println(obj.add(63,36));
    }
}
