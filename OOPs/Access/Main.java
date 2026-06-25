package OOPs.Access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(34,"Natraj");

        //need to do a few things
        //1.access the data members
        //2.modify the data members

        System.out.println(obj.getNum());
        obj.a=5;
    }
}
