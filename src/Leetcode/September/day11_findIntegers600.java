package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/11 21:47
 */

//https://leetcode-cn.com/problems/non-negative-integers-without-consecutive-ones/
public class day11_findIntegers600 {
    public int findIntegers(int n) {
        int[] dp = new int[31];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < 31; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        int pre = 0, res = 0;
        for (int i = 29; i >= 0; i--) {
            int curr = (1 << i);
            if ((n & curr) != 0) {
                res += dp[i + 1];
                if (pre == 1)
                    break;
                pre = 1;
            } else pre = 0;
            if (i == 0)
                res++;
        }
        return res;
    }

}
