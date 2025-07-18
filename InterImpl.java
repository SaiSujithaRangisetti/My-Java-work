package OOPs;

import OOPs.Interface.HelloInterface;

public abstract class InterImpl implements HelloInterface {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String name() {
        return "Chalapathi";
    }
}
