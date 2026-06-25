package JavaBasics.Recursion.Easy;

public class DigitProd {
    public static void main(String[] args) {
        System.out.println(prod(3142));
    }

    public static int prod(int n){
        if (n%10==n){
            return n;}
        return (n%10)*prod(n/10);
    }
}
