package OOPs.Interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Rock music");
    }

    @Override
    public void stop() {
        System.out.println("no music");
    }
}
