package OOPs.Inheritance;

public class Box {
    double h;
    double l;
    double  w;


    static void greetings(){
        System.out.println("Hey Im in Box:Greetings");
    }
    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
         this.w=side;
         this.l=side;
         this.h=side;
    }
    Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.l;

    }

    public void information(){
        System.out.println("Running the box");

    }
}

