package JavaBasics.Recursion.Easy;

public class Concept {
    public static void main(String[] args) {
       func(5);

    }
    static void func(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
//        func(n--);  it will first pass teh value then decrement the value of n
            func(--n);
    }

}
