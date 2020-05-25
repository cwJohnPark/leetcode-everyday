package leetcode.array;

public class FindEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int expected = 2;

        int actual = findEvenNum(nums);

        System.out.println(expected);
        System.out.println(actual);
    }

    private static int findEvenNum(int[] nums) {
        int evenNumCounter = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digit = 0;
            while(num > 0) {
                digit++;
                num /= 10;
            }

            if(digit % 2 == 0) {
                evenNumCounter++;
            }
        }

        return evenNumCounter;
    }

    // see constraints
    // 1 <= nums[i] <= 10^5
    private int findEvenNumBatterSolution(int[] nums) {
        int counter = 0;

        for (int num: nums) {
            if ((10 <= num && num < 100) || (1000 <= num && num < 1000)) {
                counter ++;
            }
        }

        return counter;
    }

}
