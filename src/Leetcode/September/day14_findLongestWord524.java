package Leetcode.September;

import java.util.List;

/**
 * @作者 Heart
 * @时间 2021/9/14 18:56
 */

//https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting/
public class day14_findLongestWord524 {

    private boolean isSubsequence(char[] s, char[] t) {
        //判断t是否为s的子序列
        int n = s.length, m = t.length;
        //如果t的长度大于s，一定不是子序列
        if (m > n) return false;
        //记录当前s中匹配到了哪个位置
        int i = 0;
        for (char ch : t) {
            while (i < n && s[i] != ch) i++;
            if (i >= n) return false;

            //此时s[i]=ch,下次要从s[i+1]
            i++;
        }
        return true;
    }

    public String findLongestWord(String s, List<String> dictionary) {
        var arr = s.toCharArray();

        //第一优先级长度，越长的越靠前；第二优先级字典，越小的越靠前
        dictionary.sort((a, b) -> {
            if (a.length() != b.length()) {
                return Integer.compare(b.length(), a.length());
            }
            return a.compareTo(b);
        });

        for (var str : dictionary) {
            if (isSubsequence(arr, str.toCharArray())) {
                return str;
            }
        }

        //未找到，返回空子符串
        return "";
    }

}
