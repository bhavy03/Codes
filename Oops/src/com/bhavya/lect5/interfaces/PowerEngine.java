package com.bhavya.lect5.interfaces;

public class PowerEngine implements engine{
    @Override
    public void start() {
        System.out.println("power engine start");
    }

    @Override
    public void stop() {
        System.out.println("power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("power engine accelerate");
    }
}
