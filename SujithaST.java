package SingleTonClass;

import OOPs.Sujitha;

public class SujithaST {
    public int age=20;
    public String name="Sujii";
    //private object early creation
    private static final SujithaST obj=new SujithaST();
    //private constructor
    private void SujithaST(){

    }
    //    public factory method
    public SujithaST GetInstance(){
//        if(obj==null){
//            obj = new SujithaST();
//        }
        return obj;
    }

    public static void main(String[] args) {
        SujithaST pro=new SujithaST();
        SujithaST pro1=new SujithaST();
        System.out.println(pro.age);
        System.out.println(pro1.age);

    }

}
