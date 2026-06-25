package OOPs.Access;

public class A {
    private int num;
    protected int a;
    String name;
    int[] arr;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public A(int num, String name) {
        this.name = name;
        this.arr = new int[num];
        this.num = num;
    }
}
