package Leetcode.September;

import java.util.Stack;

/**
 * @作者 Heart
 * @时间 2021/9/7 14:53
 */

//https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
public class day7_balancedStringSplit1221 {
    public int balancedStringSplit(String s) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() != s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
            if (stack.isEmpty()) res++;
        }
        return res;
    }

}
