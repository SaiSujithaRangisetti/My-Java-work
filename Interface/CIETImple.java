package OOPs.Interface;

public class CIETImple implements CIETInterface {

    @Override
    public String Dept() {
        return "CSIT";
    }

    @Override
    public String designation() {
        return "Professor";
    }

    @Override
    public int feesofDept() {
        return 500000;
    }

    @Override
    public int salaryByDesignation() {
        return 200000;
    }
    public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        CIETImple obj=new CIETImple();
        System.out.println(obj.Dept());
        System.out.println(obj.designation());
        System.out.println(obj.salaryByDesignation()+obj.feesofDept());
        System.out.println(obj.feesofDept());
        System.out.println(obj.add(345,687));
    }
}
