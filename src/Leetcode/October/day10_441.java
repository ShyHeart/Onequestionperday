package Leetcode.October;


//https://leetcode-cn.com/problems/arranging-coins/
public class day10_441 {
    public int arrangeCoins(int n) {
        long left = 1, right = n;
        while (left < right) {
            long mid = left + right + 1 >> 1;
            if (mid * (mid + 1) / 2 <= n) left = mid;
            else right = mid - 1;
        }
        return (int) right;
    }

    //return (int)((Math.sqrt(1 + 8.0 * n) - 1) / 2);

}
