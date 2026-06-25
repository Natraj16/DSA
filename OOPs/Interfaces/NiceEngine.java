package OOPs.Interfaces;

public class NiceEngine {
    private Engine engine;
    private Media player=new CDPlayer();
    public NiceEngine() {
        engine=new PowerEngine();
    }

    public NiceEngine(Engine engine){
        this.engine=engine;

    }
    public void start(){
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(Engine engine){
        this.engine=engine;
    }
}
