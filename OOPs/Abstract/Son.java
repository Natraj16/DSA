package OOPs.Abstract;

public class Son extends Parent{

    public Son(int age) {
        super(24);
        this.age=age;
    }

    @Override
    void career() {
        System.out.println("I am going to be doctor");
    }

    @Override
    void partner() {
        System.out.println("I love chunnu");
    }

    @Override
    void normal() {
        super.normal();
    }
}
