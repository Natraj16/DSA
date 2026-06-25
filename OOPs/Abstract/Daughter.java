package OOPs.Abstract;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(26);
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am going to be engineer");
    }

    @Override
    void partner() {
        System.out.println("I love raju" );
    }
}
