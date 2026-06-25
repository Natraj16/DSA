package JavaBasics.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list= new LL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(7);
//        list.insertFirst(9);
//
//        list.insertLast(6);
//        list.insert(50,2);
//        list.display();
//        System.out.println();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(1));

//        DLL list=new DLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(7);
//        list.insertFirst(9);
//        list.insertLast(67);
//        list.insertAfter(7,69);
//        list.display();


        CLL list=new CLL();
        list.insertTail(8);
        list.insertTail(10);
        list.insertTail(18);
        list.insertTail(80);
        list.display();
        list.deleteVal(80);
        list.display();
    }
}
