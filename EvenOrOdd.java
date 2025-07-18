package Methods;

public class EvenOrOdd {
    static public String EvenorOdd(int a){
        if(a%2==0)
            return "Even";
        else
            return "odd";
    }

    public static void main(String[] args) {
        System.out.println(EvenorOdd(8));
    }
}
