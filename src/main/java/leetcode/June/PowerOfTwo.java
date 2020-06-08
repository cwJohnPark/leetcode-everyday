package leetcode.June;

// https://leetcode.com/explore/featured/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3354/
public class PowerOfTwo {
    public static void main(String[] args) {
        //System.out.println((long)1 << 31);
        System.out.println(isPowerOfTwo(1073741824));

    }

    public static boolean isPowerOfTwo(int n) {

        long b = 1;
        while(n >= b && b <= Math.pow(2, 30)) {
            if ( n == b ) return true;
            b = b << 1;
        }
        return false;
    }

    public static boolean betterSolution(int n) {
        if(n<=0)
            return false;
        return (n&(-n)) == n;
    }
}
