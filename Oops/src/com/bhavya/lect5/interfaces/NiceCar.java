package com.bhavya.lect5.interfaces;

public class NiceCar {
    private engine engine;      //we can use interface of other class by simply creating object of it
    private media player = new CDplayer();     //but we can't refer it to engine() object rather than refer to an object that implements interface by the type of the interface
                                               //here we are not creating object of interface,we are creating an anonymous object
                         //example
//    interface test {
//          public void wish();
//       }
//    class main{
//    public static void main(String[] args) {
//       test t = new test() {
//           public void wish() {
//               System.out.println("hello world");
//           }
//       };
//    t.wish();
//}

    public NiceCar() {
        engine = new PowerEngine();
    }

    public NiceCar(engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startmusic(){
        player.start();
    }

    public void upgradeengine(){
        this.engine = new ElectricEngine();
    }
}
