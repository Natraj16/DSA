package JavaBasics.Strings;

public class Comparison {
    public static void main(String[] args) {
        String a="kunal";
        String b="kunal";
// Using the string pool
        System.out.println(a==b);

    //Creating object
        String c= new String("kunal");
        String d=new String("kunal");

        System.out.println(c==d);

        System.out.println(a.equals(b));
        System.out.println(c.equals(d));

        System.out.println(a.charAt(2));


    }
}
