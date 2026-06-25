package JavaBasics.LinearSearch;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String [] args){
        String name ="Raj";
        char tar='a';
        System.out.println(search(name,tar));
        System.out.println(search2(name, tar));
        System.out.println(Arrays.toString(name.toCharArray())); //Returns string as array
    }
    //using for each
    static boolean search2(String str, char target){
        if (str.length() == 0 ){
            return false;
        }
        for (char a: str.toCharArray()){
            if (a==target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target){
        if (str.length() == 0 ){
            return false;
        }
        for (int i=0; i<str.length(); i++){
            if (target==str.charAt(i)){
                return true;
            }
        }
    return false;
    }
}

