package com.bhavya.lect5.interfaces;

public class CDplayer implements media{
    @Override
    public void start() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("music stop");
    }
}
