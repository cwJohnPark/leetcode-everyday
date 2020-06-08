package leetcode.may;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3327/
public class SingleElementInSortedArray {

    static final int[] case1 = {1,1,2,3,3,4,4,8,8};
    static final int[] case2 = {3,3,7,7,10,11,11};

    static int expected;
    static int actual;

    public static void main(String[] args) {
        Solution solution = new Solution();

        int expected = 2;
        int actual = solution.singleNonDuplicate(case1);

        assertThat(actual, is(expected));

        expected = 10;
        actual = solution.singleNonDuplicate(case2);

        assertThat(actual, is(expected));

        System.out.println(solution.singleNonDuplicate_xor(case1));
    }

    static class Solution {
        // #1
        public int singleNonDuplicate(int[] nums) {
            if(nums.length == 1) return nums[0];
            for(int i = 0; i < nums.length-1; i+=2) {
                if(nums[i] != nums[i+1]) {
                    return nums[i];
                }
            }
            return nums[nums.length-1];
        }

        // #2
        public int singleNonDuplicate_xor(int[] nums) {
            int xor = 0;
            for(int i=0; i<nums.length; i++) {
                xor = xor ^ nums[i];
            }
            return xor;
        }
    }
}

