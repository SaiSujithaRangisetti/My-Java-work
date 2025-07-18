package Package2;

import Package3.CIETDetails;

public class CIETDriver {
    public static void main(String[] args) {
        CIETDetails obj=new CIETDetails();
        System.out.println(obj.coreSubject);
        System.out.println(obj.courseName);
        System.out.println(obj.courseFees);
        System.out.println(obj.add(10,40));
    }
}
