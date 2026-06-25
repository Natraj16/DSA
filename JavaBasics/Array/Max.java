package JavaBasics.Array;
import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        int[] arr = {56,767,23,65,78,98,24,57};
        System.out.println(max(arr));
        System.out.println(rangeMax(arr,3,6));
    }
    //work on some edge cases in case of array is null and all
    static int rangeMax(int[] arr, int index1, int index2) {
        if(index2<index1){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int a = arr[0];
        for (int i = index1; i < index2; i++) {
            if (arr[i] > a) {
                a = arr[i];
            }

        }
        return a;
    }
static int max(int[] arr) {
        if(arr.length==0){
            return -1;
        }
    int a = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > a) {
            a=arr[i];
        }

    }
    return a;
}
}
