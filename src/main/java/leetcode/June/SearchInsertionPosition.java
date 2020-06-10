package leetcode.June;

// https://leetcode.com/explore/featured/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3356/
public class SearchInsertionPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 0));
    }
    public static int searchInsert(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
