package OOPs.Singelton;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();

        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

        // all three ref variable are pointing to just one object
    }
}
