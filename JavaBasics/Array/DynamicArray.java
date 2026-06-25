package JavaBasics.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        //it is used for arraylist example when we dont know the size of the array
        //Syntax
        ArrayList<Integer> list =new ArrayList<>(10);
        list.add(15);
        list.add(16);
        list.add(65);
        list.add(65);
        list.add(34);

        System.out.println(list.contains(15));
        list.set(0,98);

        list.remove(2);
        System.out.println(list);

        Scanner s= new Scanner(System.in);
        //input
        for(int i=0; i< 5; i++) {
            list.add(s.nextInt());

        }

        //get item at any index
        for(int i=0; i< 5; i++) {

            System.out.println(list.get(i));//pass index here, lst[index syntax will not here
        }
        System.out.println(list);

        //internal working
        //no size is required
        //1.Size is actually fixed internally
        //2.Say Arraylist is filled with some amount(it will create a new arraylist of say, double the size and old elements are copeied in new, old one is deleted
    }
}
