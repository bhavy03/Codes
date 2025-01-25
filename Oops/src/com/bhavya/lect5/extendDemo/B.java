package com.bhavya.lect5.extendDemo;

public interface B {
//    static interface methods should always have a body as they can't be overridden, nor they can inherit
    void greet();
    static void greeting(){           //call it via interface name
        System.out.println("i am greeting");
    }
}
