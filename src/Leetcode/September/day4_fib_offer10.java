package Leetcode.September;

import java.util.HashMap;
import java.util.Map;

/**
 * @作者 Heart
 * @时间 2021/9/4 14:15
 */

//https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/

public class day4_fib_offer10 {
    /**
     * 斐波那契数
     *
     * @param n
     * @return
     */
    public int fib1(int n) {
        if (n < 2) {
            return n;
        }
        return fib1(n - 1) + fib1(n - 2);
    }

    //递归解法
    int constant = 1000000007;

    public int fib(int n) {
        return fib(n, new HashMap<>());
    }

    public int fib(int n, Map<Integer, Integer> map) {
        if (n < 2)
            return n;
        if (map.containsKey(n))
            return map.get(n);
        int first = fib(n - 1) % constant;
        map.put(n - 1, first);
        int second = fib(n - 2) % constant;
        map.put(n - 2, second);
        int res = (first + second) % constant;
        map.put(n, res);
        return res;
    }


    //解法二
    public int fib2(int n) {
        final int MOD = 1000000007;
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = (p + q) % MOD;
        }
        return r;
    }

    //解法三
    public int fib3(int n) {
        int constant = 1000000007;
        int first = 0;
        int second = 1;
        while (n-- > 0) {
            int temp = first + second;
            first = second % constant;
            second = temp % constant;
        }
        return first;
    }

}
