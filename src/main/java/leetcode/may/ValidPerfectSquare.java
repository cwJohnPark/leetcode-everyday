package leetcode.may;

/**
 *  양의 정수 num이 주어졌을 때, num이 완전한 정사각형이라면 true를, 아니라면 false를 반환하시오.
 */
public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare square = new ValidPerfectSquare();
        assert square.isPerfectSquare(Integer.MAX_VALUE) == false;
        assert square.isPerfectSquare(16) == true;
        System.out.println(square.isPerfectSquare(4));
    }
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int low = 1;
        int high = num / 2;
        while(true) {
            int guess = getGuess(low, high);

            long guessSquared = Integer.MAX_VALUE < (long) guess * guess ? Long.MAX_VALUE : guess * guess;
            if(guessSquared == num) {
                return true;
            } else if(high == guess) {
                return false;
            }

            if(guessSquared > num) {
                high = guess;
            } else {
                low = guess;
            }

        }
    }

    private int getGuess(int low, int high) {
        return (int) (Math.round((double)(low + high) / 2));
    }
}
