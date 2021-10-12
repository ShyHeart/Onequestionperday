package Leetcode.October;


//https://leetcode-cn.com/problems/divide-two-integers/
public class day12_29 {
    int MIN = Integer.MIN_VALUE, Max = Integer.MAX_VALUE;
    int LIMIT = -1073741824;//MIN的一半

    public int divide(int dividend, int divisor) {
        if (dividend == MIN && divisor == -1) return Max;
        boolean flag = false;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) flag = true;
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        int ans = 0;
        while (dividend <= divisor) {
            int a = divisor, b = -1;
            while (a >= LIMIT && b >= LIMIT && a >= dividend - a) {
                a += a;
                b += b;
            }
            dividend -= a;
            ans += b;
        }
        return flag ? ans : -ans;
    }
}
