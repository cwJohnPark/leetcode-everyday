package leetcode.array;

import java.util.Arrays;

//https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
public class DuplicateZeros {
    public static void main(String[] args) {
        int[] e1 = {1,0,2,3,0,4,5,0};
        duplicateZeros(e1);
        System.out.println(Arrays.toString(e1));
    }
    public static void duplicateZeros(int[] arr) {
        int[] tmp = new int[20000];
        for(int i = 0, j = 0; i< arr.length; i++) {
            if(arr[i] == 0) {
                tmp[j++] = 0;
                tmp[j+1] = 0;
            } else {
                tmp[j] = arr[i];
            }
            j++;
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = tmp[i];
        }
    }
}
