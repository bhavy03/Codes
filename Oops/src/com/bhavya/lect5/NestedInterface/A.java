package com.bhavya.lect5.NestedInterface;

public class A {
    public interface nestedinterface{      //nested interface can be declared public,private,protected but top level interface can only be declared as
        boolean isodd(int num);            //either public or default
    }

}

class B implements A.nestedinterface{

    @Override
    public boolean isodd(int num) {
        return (num & 1) == 1;
    }
}

