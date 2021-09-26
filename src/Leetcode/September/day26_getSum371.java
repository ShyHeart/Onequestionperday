package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/26 9:33
 */
//https://leetcode-cn.com/problems/sum-of-two-integers/
public class day26_getSum371 {
    public int getSum(int a, int b) {
        int ans = 0;
        for (int i = 0, t = 0; i < 32; i++) {
            int u1 = (a >> i) & 1, u2 = (b >> i) & 1;
            if (u1 == 1 && u2 == 1) {
                ans |= (t << i);
                t = 1;
            } else if (u1 == 1 || u2 == 1) {
                ans |= ((1 ^ t) << i);
            } else {
                ans |= (t << i);
                t = 0;
            }
        }
        return ans;
    }
}
