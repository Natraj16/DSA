package OOPs.Access;

public class ObjectDemo {
    int num;
    int val;
    float gpa;
    public ObjectDemo(int num,float gpa) {
        this.num = num;
        this.gpa=gpa;}
    // we will go in detail of how to create it in hashmap
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    // already covered
    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(24,8.5f);
        ObjectDemo obj2=new ObjectDemo(26,9.5f);

        System.out.println(obj.hashCode());

        if(obj == obj2) {
            System.out.println("obj1 is equal to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("Equal");
        }
        System.out.println(obj.getClass()  );
    }
}
