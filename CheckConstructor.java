package Constructor;

public class CheckConstructor {
    public static void main(String[] args) {
        System.out.println("Hey Guys Welcome");
        System.out.println(add(63,36));
        CheckConstructor obj=new CheckConstructor();
    }
    public CheckConstructor(){
        System.out.println("Hello Iam created by Sujitha");
        System.out.println("Created on June 30 2025");
        int a=10,b=20;
        System.out.println(a+b);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
