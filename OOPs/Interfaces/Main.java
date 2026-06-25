package OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        NiceEngine car = new NiceEngine();

//        car.accelerate();
//        car.start();
//        car.stop();
//
//        Media carMedia=new Car();
//        carMedia.stop();
//    }

        car.start();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());
        car.start();    }
}
