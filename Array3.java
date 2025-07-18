package Arrays;
//Declaration of a float array
public class Array3 {
    public static void main(String[] args) {
        float[] a=new float[5];
        a[0]=4;
        a[1]=14;
        a[2]=24;
        a[3]=34.7f;
        a[4]=44;
        System.out.println(a[0]);
        System.out.println(a[0]+a[2]);
        a[0]=104;
        System.out.println(a[0]);
        System.out.println(a[4]);
    }
}
