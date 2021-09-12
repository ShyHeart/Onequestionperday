package Leetcode.September;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @作者 Heart
 * @时间 2021/9/12 15:18
 */

//https://leetcode-cn.com/problems/valid-parenthesis-string/
public class day12_checkValidString678 {
    public boolean checkValidString(String s) {
        Deque<Integer> leftStack = new LinkedList<Integer>();
        Deque<Integer> asterStack = new LinkedList<Integer>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftStack.push(i);
            } else if (c == '*') {
                asterStack.push(i);
            } else {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                } else if (!asterStack.isEmpty()) {
                    asterStack.pop();
                } else {
                    return false;
                }
            }
        }
        while (!leftStack.isEmpty() && !asterStack.isEmpty()) {
            int leftIndex = leftStack.pop();
            int asteriskIndex = asterStack.pop();
            if (leftIndex > asteriskIndex) {
                return false;
            }
        }
        return leftStack.isEmpty();
    }

}
