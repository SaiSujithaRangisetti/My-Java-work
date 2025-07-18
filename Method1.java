package Methods;

public class Method1 {
    static public int add(int a,int b) {//method with 2 parameters
        return a + b;
    }
    public int add(){//method with 0 parameters
        int a=10;
        int b=5;
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }//This method is known as method overloading
    //method overloading will work unless the parameters are different
    public static void main(String[] args) {
        Method1 ob=new Method1();
        System.out.println(add(20,50));
        System.out.println(ob.add());
        System.out.println(ob.add(12,45,90));
    }
}
