package leetcode.may;

import leetcode.util.annotation.InProgress;

//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/
@InProgress
public class RemoveKDigits {
    public static void main(String[] args) {
        String num;
        int k;

        num = "1432219";
        k = 3;

        String result = Solution.removeKdigits(num, k);
        System.out.println(result);

    }

    static class Solution {
        public static String removeKdigits(String num, int k) {
            char[] digits = num.toCharArray();
            char[] removedDigits = new char[digits.length - k];

            for(int i = 0, j = 0; i+k < digits.length; i++){
                if(j >= removedDigits.length)
                    break;
                if(digits[i] != 0) {
                    removedDigits[j++] = digits[i];
                }
            }

            int resultDigit = Integer.parseInt(new String(removedDigits));
            return String.valueOf(resultDigit);
        }
    }
}
