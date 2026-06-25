package JavaBasics.Array;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLClientInfoException;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //array of primitive
        arr[0] = 23;
        arr[1] = 26;
        arr[2] = 18;
        arr[3] = 153;
        arr[4] = 98;
        System.out.println(arr[0]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//            System.out.println(arr[i] + " "); //printing arr
//        }
//            //for each loop
//        for(int num:arr){//for every element in the array print element
//            System.out.println(num+" ");//num represents each element like i in the purana loop
//             }
//            System.out.println(arr[5]);//index out of bound error

        System.out.println(Arrays.toString(arr));//easy way to print the array with the method of the Array class

        //Array of object
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));
        str[1]="aa";
        System.out.println("*********************************************");


        //Multidimensional array

    }
    }

