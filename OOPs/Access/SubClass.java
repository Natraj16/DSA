package OOPs.Access;

import javax.security.auth.Subject;

public class SubClass extends A{
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj=new SubClass(45,"Natraj");
        int n=obj.a;

        System.out.println(obj instanceof A);
    }
}
class SubSubClass extends A{

    public SubSubClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        SubSubClass obj=new SubSubClass(45,"Natraj");
        int n=obj.a;
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Natraj");
        int n = obj.a;
    }
}}