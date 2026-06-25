package OOPs.Polymorphism;

public class Square extends Shapes  {
    //this will run when obj of circle is created,hence it is overridding the parent method
   @Override//this is called annotation
    void area (){
        System.out.println("area is sauare of side ");

    }
}
