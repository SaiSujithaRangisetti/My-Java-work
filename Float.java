package Methods;

public class Float {
    public static float add(float a,float b){
        return a+b;
    }    public static double sub(float a,float b){
        return a-b;
    }    public  float mul(float a,float b){
        return a*b;
    }    public float div(float a,float b){
        return a/b;
    }    public float mod(float a,float b){
        return a%b;
    }

    public static void main(String[] args) {
        Float ob=new Float();
        System.out.println(add(20.6f,60.9f));
        System.out.println(sub(80.9f,70.6f));
        System.out.println(ob.mul(76.0f,89.7f));
        System.out.println(ob.div(30.9f,7.5f));
        System.out.println(ob.mod(67.0f,9.8f));
    }
}
