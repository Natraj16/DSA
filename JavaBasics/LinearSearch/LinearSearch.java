package JavaBasics.LinearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num={23,63,54,84,78,87,54,12};
//        int target=84;
        int target=100;
        int ans=linearSearch(num,target);
        int ans1=linearSearch2(num, target);
        System.out.println(ans);
        System.out.println(ans1);
    }
    //search the target and return true and false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length==0){
            return false;
        }
        for(int element: arr){
            //check the element at every index if it is = target
            if (element==target){
                return true;
            }
        }
        return false;
    }
    //search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length==0){
            return -1;
        }
        for(int element: arr){
            //check the element at every index if it is = target
            if (element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
        //search the array: return the index if the item found
    //otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
    if (arr.length==0){
        return -1;
    }
    for(int index=0; index<arr.length; index++){
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
