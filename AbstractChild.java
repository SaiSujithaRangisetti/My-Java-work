package OOPs;

public class AbstractChild extends Abstract1{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
    public float div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        AbstractChild obj=new AbstractChild();
        System.out.println(obj.name());
        System.out.println(obj.div(10,2));
        System.out.println(obj.sub(100,8));
        System.out.println(obj.add(560,89));
        System.out.println(obj.mul(12,56));
    }
}
