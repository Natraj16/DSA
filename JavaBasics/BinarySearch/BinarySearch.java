package JavaBasics.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
 int[] arr={-8,2,4,6,8,7,25,36};
 int target=25;
 int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    //return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
//            int mid=(start+end)/2; //might be possible that (start+end) exceeds the range of integer in java
            int mid= start+(end-start)/2;

            if(target < arr[mid]) {
                end=mid-1;
            }
            else if (target > arr[mid]){
                start=mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
    return -1;
    }
}
