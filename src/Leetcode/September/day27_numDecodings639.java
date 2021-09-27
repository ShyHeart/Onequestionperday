package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/27 23:17
 */
//https://leetcode-cn.com/problems/decode-ways-ii/
public class day27_numDecodings639 {
    int mod = (int) 1e9 + 7;

    public int numDecodings(String s) {
        int n = s.length();
        long[] f = new long[3];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            char c = s.charAt(i - 1);
            int t = c - '0';
            long cnt = 0;
            int p1 = (i - 1) % 3, p2 = (i - 2) % 3;
            for (int item = 1; item <= 26; item++) {
                if (item < 10) {
                    if (c == '*' || t == item) cnt += f[p1];
                } else {
                    if (i - 2 < 0) break;
                    char prev = s.charAt(i - 2);
                    int u = prev - '0';
                    int a = item / 10, b = item % 10;
                    if ((prev == '*' || u == a) && (t == b || (c == '*' && b != 0)))
                        cnt += f[p2];
                }
            }
            f[i % 3] = cnt % mod;
        }
        return (int) (f[n % 3]);
    }

}
