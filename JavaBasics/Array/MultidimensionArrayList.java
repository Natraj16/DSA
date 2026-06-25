package JavaBasics.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //Initiliazation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        Scanner s=new Scanner(System.in);
        //add elements
        for (int i=0; i<3; i++ ){
            for(int j= 0;j<3;j++){
                list.get(i).add(s.nextInt());
            }

        }
        System.out.println(list);

        //for multidimensional array list, for each element there should be Arraylist to have an element at each place
    }
}
