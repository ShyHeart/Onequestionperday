package Leetcode.October;


//https://leetcode-cn.com/problems/count-and-say/
public class day15_38 {
    public String countAndSay(int n) {
        String ans = "1";
        for (int i = 2; i <= n; i++) {
            String cur = "";
            int m = ans.length();
            for (int j = 0; j < m; ) {
                int k = j + 1;
                while (k < m && ans.charAt(j) == ans.charAt(k)) k++;
                int cut = k - j;
                cur += cut + "" + ans.charAt(j);
                j = k;
            }
            ans = cur;
        }
        return ans;
    }

}
