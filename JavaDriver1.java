package Package2;

import Package1.Static1;

public class JavaDriver1 {
    public static void main(String[] args) {
        Static1 w=new Static1();
        System.out.print(Static1.w);
        System.out.print(" From "+Static1.daY+" days");
        System.out.print(" at "+w.Loc);
    }
}
