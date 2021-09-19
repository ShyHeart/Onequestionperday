package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/19 19:03
 */

//https://leetcode-cn.com/problems/2-keys-keyboard/
public class day19_minSteps650 {

    //暴力解法
    int INF = 10000;

    public int minSteps1(int n) {
        return dfs(n, 1, 0);
    }

    private int dfs(int n, int curr, int clipboard) {
        if (curr > n) {
            return INF;
        }
        if (curr == n) {
            return 0;
        }
        int ans = INF;
        if (clipboard > 0) {
            //粘贴剪切板字符
            ans = Math.min(ans, dfs(n, curr + clipboard, clipboard));
        }
        //如果是上一次是复制，这一次就没有必要再复制了
        if (curr != clipboard) {
            ans = Math.min(ans, dfs(n, curr, curr));
        }
        return ans + 1;
    }


    //如果我们将「11 次 Copy All + xx 次 Paste」看做一次“动作”的话。
    //那么 一次“动作”所产生的效果就是将原来的字符串变为原来的 x + 1x+1 倍。
    public int minSteps(int n) {
        int ans = 0;
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                ans += i;
                n /= i;
            }
        }
        if (n != 1) ans += n;
        return ans;
    }
}
