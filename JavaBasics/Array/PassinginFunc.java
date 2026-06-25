package JavaBasics.Array;

import java.util.Arrays;

public class PassinginFunc {
    public static void main(String[] args) {

        int[] nums={3,4,6,4,9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){

        arr[0]=99;
    }
}
//In java there is only call by value, when we pass an object reference it will a take a copy of the reference which is going to point to the same object
//The copy of the reference variable is passed in the function and is pointing to the same object
//both are pointing to the same object thats why the original value also get changed
//this is called mutable behaviour
//strings are immutable in java and arrays are mutable in java(you can change the objects)