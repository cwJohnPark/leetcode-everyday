package leetcode.array;

// https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecutiveOne {

}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[-i] == nums[i]) {
                count++;
            }
            if(maxCount > count) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
