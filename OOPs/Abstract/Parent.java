package OOPs.Abstract;

public abstract class Parent {

    int age;

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE=24;
    }

    static void hello(){
        System.out.println("hello");
    }
    void normal(){
        System.out.println("hello no   rmally");
    }
    abstract void career();
    abstract void partner();


}
