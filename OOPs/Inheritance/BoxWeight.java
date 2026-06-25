package OOPs.Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){         //copy construct or
        super(other);
        weight=other.weight;
    }
    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //call theparent class constructor
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight=weight;
    }

    static void greetings(){
        System.out.println("Hey Im in BoxWeight:Greetings");
    }
}
