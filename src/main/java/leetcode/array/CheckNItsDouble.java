package leetcode.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
public class CheckNItsDouble {

    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {7, 1, 14, 11};
        int[] arr3 = {3, 1, 7, 11};
        int[] arr4 = {-2, 0, 10, -19, 4, 6, -8}; // false
        int[] arr5 = {0, 0};                     // true
        //System.out.println(checkIfExist(arr1));
        //System.out.println(checkIfExist(arr2));
        //System.out.println(checkIfExist(arr3));
        System.out.println(checkIfExist(arr4));
        System.out.println(checkIfExist(arr5));
    }

    public static boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]) && arr[i] == 0) {
                return true;
            }
            map.put(arr[i], i);
        }

        for(int e : arr) {
            if(map.containsKey(e * 2) && e != 0) {
                return true;
            }
        }

        return false;
    }

    public static boolean betterSolution(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int a:arr){
            if(set.contains(a*2) || ( a%2==0 && set.contains(a/2))) return true;
            set.add(a);
        }
        return false;
    }
}
