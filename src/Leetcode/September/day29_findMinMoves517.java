package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/30 21:06
 */
//https://leetcode-cn.com/problems/super-washing-machines/
public class day29_findMinMoves517 {
    public int findMinMoves(int[] machines) {
        int n = machines.length;
        int sum = 0;
        for (int i : machines) sum += i;
        int t = sum / n;
        int ls = 0, rs = sum;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            rs -= machines[i];
            int a = Math.max(t * i - ls, 0);
            int b = Math.max((n - i - 1) * t - rs, 0);
            ans = Math.max(ans, a + b);
            ls += machines[i];
        }
        return ans;
    }

}
