package JavaBasics.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] num={23,63,54,84,78,87,54,12};
         int target=84;
         int ans=searchinRange(num,target,1,5);
        System.out.println(ans);
    }
    static int searchinRange(int[] arr, int target, int  start, int end) {
        if (arr.length==0){
            return -1;
        }
        for(int index=start; index<=end; index++){
            int element=arr[index];
            if (element==target){
                return index;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
