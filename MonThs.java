package EnUm;

public enum MonThs {
    JANUARY, FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBE;

    public static void main(String[] args) {
        System.out.println(MonThs.JANUARY);
        System.out.println(MonThs.APRIL.ordinal()+1);
        System.out.println(MonThs.valueOf("MAY"));
    }
}
