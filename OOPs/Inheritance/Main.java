package OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4);
        Box box1=new Box();
        Box box2=new Box(4,3,2);
        Box box3=new Box(box1);

        Box box5=new BoxWeight(2,3,4,4);
//        System.out.println(super.weight  );
        //the type of ref variable determines what members can be accessed not the type of object

//        BoxWeight box6=new Box(4,1,6);
        System.out.println(box.l+" "+box.w+" "+box.h);
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        System.out.println(box3.l+" "+box3.w+" "+box3.h);

        BoxWeight box4=new BoxWeight();
        System.out.println(box4.h+" "+box4.weight);


        BoxPrice box9=new BoxPrice();
        BoxPrice box10=new BoxPrice(9,8,10);

        box1.greetings();

        Box b=new BoxWeight();
        b.greetings();


    }
}
