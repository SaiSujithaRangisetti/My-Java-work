package OOPs;
//code reusability is the advantage of inheritance
//
public class SmallHello extends Hello {

    public static void main(String[] args) {
        Hello obj1=new Hello();//Parent class object
        System.out.println(obj1.add(10,40));//parent class add method will be executed
        SmallHello hello=new SmallHello();//Child Class object
        System.out.println(hello.name);
        System.out.println(hello.mul(30,708));
        System.out.println(hello.add(10,20));//child class add method will be executed
        Hello obj=new SmallHello();//Object creation using parent and child relation
        System.out.println(obj.sub());
        System.out.println(obj.add(10,20));//Child class add will be executed
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int add(int a,int b){//overriding the paret class
        return a*b;
    }
    public int age=20;
}
