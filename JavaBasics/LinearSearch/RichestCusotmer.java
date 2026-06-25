package JavaBasics.LinearSearch;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCusotmer {
    public static void main(String[] args) {
            int[][] arr={
                    {5,6,1},
                    {1,6},
                    {5,1,1}
            };
        System.out.println(maximumWealth(arr));
      }

    static int maximumWealth(int[][] accounts) {

        int maxsum = 0;
        for (int[] i : accounts) {
            int rowsum = 0;
            for (int j : i) {
                rowsum += j;
            }
            if (maxsum < rowsum) {
                maxsum = rowsum;
        }

        }
        return maxsum;
    }
}
