package leetcode.array;

import java.util.Arrays;

// Replace Elements with Greatest Element on Right Side
// https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3259/
public class ReplaceElements {
    public static void main(String[] args) {
        int[] a = {17,18,5,4,6,1};
        replaceElements(a);
        System.out.println(Arrays.toString(a));
    }
    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = max;
            max = temp > max ? temp : max;
        }

        return arr;
    }
}
