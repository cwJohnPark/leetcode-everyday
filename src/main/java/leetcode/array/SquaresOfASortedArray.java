package leetcode.array;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] input = {-7,-3,2,3,11};
        int[] expected = {4,9,9,49,121};
        int[] actual =  sortedSquares(input);
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(actual));
    }
    public static int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
