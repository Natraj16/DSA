package OOPs;

import java.sql.SQLOutput;

public class WrapperEg {
    public static void main(String[] args) {
        int x =10;
        Integer num=45;


        Integer a=10;
        Integer b=20;
        swap(a,b);

        final A natraj=new A("natraj kashyap");
        //when a non primitive is final, you cannot reassign it

        A obj;
        for(int i=0;i<100000000;i++){
            obj=new A("Random Name");

        }
    }
    static class A{
        final int num=10;

        public A(String name) {
            System.out.println("obejct created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }

        String name;

    }
        static void swap(Integer a, Integer b){
            Integer temp=a;
            a=b;
            b=temp;
        }
    }


