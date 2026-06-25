package OOPs.Polymorphism;

public class Numbers {
    int sum(int a ,int b){
        return a+b;
    }
    int sum(int a,int b, int c){
        return a+b+c;
    }

    public static  void main(String[] args) {
        Numbers num=new Numbers();
        num.sum(2,3);
        num.sum(2,4,5);
        //during the compile time it determines which method or constructor is gonna run, if we try to pass more params than the defined methods or constructor it will tell us during the compile time
    }
}
