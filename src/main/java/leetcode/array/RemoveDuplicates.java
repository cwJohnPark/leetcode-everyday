package leetcode.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int length1 = removeDuplicates(nums1);
        System.out.println(length1 + " : " +Arrays.toString(nums1));

        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int length2 = removeDuplicates(nums2);
        System.out.println(length2 + " : " + Arrays.toString(nums2));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}
