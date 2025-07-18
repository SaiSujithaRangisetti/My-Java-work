package EnUm;

public enum dayS {
    MONDAY, TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
    public static void main(String[] args) {
        System.out.println(dayS.MONDAY);
        System.out.println(dayS.THURSDAY.ordinal());
        System.out.println(dayS.valueOf("WEDNESDAY"));
//        dayS[] day=dayS.values();
//     String[] s1={"VJ","Vedhya"};
//        for(dayS temp:day){
//            System.out.print(temp+" ");
//        }
    }
}


