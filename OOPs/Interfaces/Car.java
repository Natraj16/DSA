package OOPs.Interfaces;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Vroom");
    }

}
