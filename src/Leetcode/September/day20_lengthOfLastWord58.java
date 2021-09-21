package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/21 21:48
 */

//https://leetcode-cn.com/problems/length-of-last-word/
public class day20_lengthOfLastWord58 {
    public int lengthOfLastWord(String s) {

        int n = s.length();
        int m = n - 1;

        while (m >= 0 && s.charAt(m) == ' ') m--;
        int i = m;
        while (i >= 0 && s.charAt(i) != ' ') i--;
        return m - i;

    }

}
