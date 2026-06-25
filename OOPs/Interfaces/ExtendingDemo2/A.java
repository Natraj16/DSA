package OOPs.Interfaces.ExtendingDemo2;

public interface A {
    //static interface methods should always have a body
   static void greetings(){
       System.out.println("Hey ");
   };

    default void fun() {
        System.out.println("I am in A");
    }
}
