package leetcode.array;

// https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
public class ValidMountainArray {
    public static void main(String[] args) {
        int[] a1 = {2, 1};
        int[] a2 = {3, 5, 5};
        int[] a3 = {0, 3, 2, 1};

        System.out.println(validMountainArray(a1));
        System.out.println(validMountainArray(a2));
        System.out.println(validMountainArray(a3));
    }

    public static boolean validMountainArray(int[] A) {
        int N = A.length;
        int i = 0;

        // walking up
        while(i < N-1 && A[i] < A[i+1])
            i++;

        // at the peek
        if(i == 0 || i == N-1)
            return false;

        // walking down
        while(i < N -1 && A[i] > A[i+1])
            i++;

        return i == N-1;
    }
}
