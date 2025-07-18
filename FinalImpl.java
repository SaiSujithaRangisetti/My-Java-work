package OOPs;

import OOPs.Interface.FinalInterface;

public class FinalImpl implements FinalInterface {
    @Override
    public int add() {
        return 234;
    }

    @Override
    public int sub() {
        return 432;
    }

    @Override
    public int div() {
        return 123;
    }

    @Override
    public int mul() {
        return 897;
    }

    public static void main(String[] args) {
        FinalImpl obi=new FinalImpl();
        System.out.println(obi.add());
        System.out.println(obi.sub());
        System.out.println(obi.div());
        System.out.println(obi.mul());
    }
}
