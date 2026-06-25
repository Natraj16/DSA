package OOPs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //store 5 roll no
//        int[] numbers=new int[5];
//
//
//        //store 5 names
//        String[] names=new String[5];
//
//        //data of 5 students: {roll no, name, marks}
//        int[] rno=new int[5];
//        String[] name=new String[5];
//        float[] marks=new float[5];

//        Students[] student=new Students[5];

//        Students natraj;
//        natraj=new Students();
        Students natraj =new Students(117,"Natraj Kashyap",8.4f);
        Students rahul=new Students();


        rahul.changeName("SEXYBOY");
        rahul.greetings();
//        natraj.rno=117;
//        natraj.name="Natraj Kashyap";
//        natraj.marks= 8.4f;
        System.out.println(natraj.rno);
        System.out.println(natraj.name );
        System.out.println(natraj.marks);
        System.out.println(rahul.rno);
        System.out.println(rahul.name );
        System.out.println(rahul.marks);
//        System.out.println(natraj.salary );
//        System.out.println(Arrays.toString(natraj));
        Students random=new Students(natraj);
        System.out.println(random.rno);
        Students random2=new Students();
        System.out.println(random2.name) ;

        Students one= new Students();
        Students two=one;
    }
    //create a class
    //for every single student
    static class Students{
        int rno;
        String name;
        float marks;

        //we need a way to add the values to the above properties object by object
        //we need one word to access every object
        //this keyword
        void greetings(){
            System.out.println("hello my name is"+ this.name);
        }
        void changeName(String newName){
            name=newName;
        }
        Students(int rno, String name, float marks){
            this.rno=rno;
            this.name=name;
            this.marks=marks;
//            this.rno=117;
//            this.name="Natraj Kashyap";
//            this.marks= 8.4f;

        }
        Students (Students other){
            this.name=other.name;
            this.rno=other.rno;
            this.marks=other.marks;
        }
//        Students(){
//
//            this.rno=115;
//            this.name="Naaj Kashyap";
//    this.marks= 8.8f;
//    }
    Students(){
            //this is how you call a constructor from another constructor
        //internally:new Student(15,"default person",100.0f)
            this(15,"default person",100f);
    }
}
}