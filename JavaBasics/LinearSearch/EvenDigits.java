package JavaBasics.LinearSearch;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans=findNumbers(nums);
        System.out.println(ans);
        System.out.println(digit2(363161));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (even(n)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int nums) {
        int noofDigits = digits(nums);
        if (noofDigits % 2 == 0) {
            return true;
        }
    return false;
    }

    static int digits(int num) {
        if (num<0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
    return count;
    }
    static int digit2(int nums){
        return (int)(Math.log10(nums))+1;
    }

}

