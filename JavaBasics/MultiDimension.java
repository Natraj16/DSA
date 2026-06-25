package JavaBasics;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        /*
        1 2 3 4
        4 5 6 7
        8 9 9 9
         */

        int[][] arr=new int[3][];//the number of column not mandatory to specify

        int[][] ar={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //in java 2d array, we can imagine it as an  array of arrays meaning 0th index is array itself and so on
        //in heap memory, it is stored as an array in which arrays are stored as the element of the main array

       //column is not specified because that evry row has variable no of column
        // as an array can something like this

        int[][]mat={
                {1,1,3},//0th index
                {2,3},//1st index
                {5,6,67}//2nd index-> mat[2]={5,6,67}

        };

        Scanner s=new Scanner(System.in);
        System.out.println("***********************************");
        //input
        int [][] arr2d=new int[3][3];
        System.out.println(arr.length);//returns number of rows

        for(int row=0;row<arr2d.length;row++){
            //for every col in every row
            for(int col=0;col<arr2d[row].length;col++){
                arr2d[row][col]=s.nextInt();
            }
        }
    //printing the array
        for(int row=0;row<arr2d.length;row++){
            //for every col in every row
            for(int col=0;col<arr2d[row].length;col++){
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println();
        }
        //Printing each array of 2d array using ArraystoString
        for(int row=0;row<arr2d.length;row++){
            //for every col in every row
            System.out.println(Arrays.toString(arr2d[row]));
            }
        //printing the array using the enhanced for loop
        for(int[] a: arr2d) {
            System.out.println(Arrays.toString(a) + " ");
        }
//        //string ke lie
//    for(String element:arr){
//        System.out.println(element);
//    }

    }}
