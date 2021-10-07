package Leetcode.October;

//https://leetcode-cn.com/problems/number-of-segments-in-a-string/
public class day7_434 {
    public int countSegments(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; ) {
            if (s.charAt(i) == ' ' && i++ >= 0) continue;
            while (i < n && s.charAt(i) != ' ') i++;
            ans++;
        }
        return ans;
    }
}
