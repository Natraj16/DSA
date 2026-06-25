package OOPs.StaticExample;

//this will print same name for both the object name as same because the static variable is changed
// class A{
//   static String name;
//
//    public A(String name) {
//        A.name = name;
//    }
//}

public class InnerClass {
   static class A{
         String name;

         public A(String name) {
            this.name = name;


        }
    }
     public static void main(String[] args) {
        A a=new A("Raj");
        A b= new A("Raju");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
//Outside classes cant be static
//static B{

//}
