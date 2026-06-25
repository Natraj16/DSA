package JavaBasics.LinearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] num={
                {12,13,14},
                {69,63,34},
                {87,24,36}
        };
        int target=69;
        int[] ans= search(num,target);//format of return value{row,column}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(num));
    }

    static int[] search(int[][] arr ,int tar){
    for (int row=0; row<arr.length; row++){
        for(int col=0; col<arr[row].length; col++){
            if (tar==arr[row][col]){
                return new int[]{row,col};
            }
        }
    }
        return new int[]{-1,-1};
    }
    //maximum with the enhanced for loops
    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints: arr){
            for(int element: ints){
                if (element > max){
                    max=element;

                }

            }
        }
        return max;
    }
}
