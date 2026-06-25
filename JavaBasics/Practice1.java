package JavaBasics;
//https://leetcode.com/problems/sort-colors/?utm_source=chatgpt.com
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 0, 0, 1, 2};
        System.out.println(Arrays.toString(sortColors(arr)));
    }
//    static int[] sortColors(int[] nums) {
//        int low = 0;
//        int high = nums.length - 1;
//        int mid = 0;
//        while (mid <= high) {
//            if (nums[mid] == 0) {
//                int temp = nums[low];
//                nums[low] = nums[mid];
//                nums[mid] = temp;
//                mid++;
//                low++;
//            } else if (nums[mid] == 1) {
//                mid++;
//            } else {
//                int temp = nums[high];
//                nums[high] = nums[mid];
//                nums[mid] = temp;
//                high--;
//            }
//        }
//        return nums;
//    }
//
//}
//_________________________________________________________________

    static int[] sortColors(int[] nums) {
        int low = 0;
        int mid =0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
        return nums;
    }
}