package leetcode.June;

// https://leetcode.com/explore/featured/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3350/
public class ReverseString {
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s1);
        System.out.println(s1);
        reverseString(s2);
        System.out.println(s2);
    }
    public static void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1- i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
