package com.bhavya.lect5.interfaces;

public class car implements engine,brake{
    int a =5 ;
    @Override
    public void bake() {
        System.out.println("i brake like normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like normal car");
    }

    @Override
    public void acc() {
        System.out.println("i accelerate like normal car");
    }
}
