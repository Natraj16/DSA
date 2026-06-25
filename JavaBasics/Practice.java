package JavaBasics;
//https://leetcode.com/problems/search-insert-position/
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {9, 2, 7, 1};
        int target = 5;
        System.out.println(searchInsert(arr, target));

    }


    static int searchInsert(int[] nums, int target) {
        int arr[] = new int[nums.length + 1];
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        arr[i] = target;
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}

