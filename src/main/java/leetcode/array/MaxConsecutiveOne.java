package leetcode.array;

// https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,1,0,1,1,1};
        int expected = 3;
        int actual = solution.findMaxConsecutiveOnes(arr);

        System.out.println("expected : " + expected);
        System.out.println("actual : " + actual);

    }

}

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            if(maxCount < count) {
                maxCount = count;
            }
        }
        return maxCount;
    }
}
