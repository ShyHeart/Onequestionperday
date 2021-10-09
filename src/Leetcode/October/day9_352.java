package Leetcode.October;

import java.util.ArrayList;
import java.util.List;

//https://leetcode-cn.com/problems/data-stream-as-disjoint-intervals/
public class day9_352 {
}

class SummaryRanges {

    List<int[]> list = new ArrayList<>();
    int[] head = new int[]{-10, -10}, tail = new int[]{10010, 10010};

    public SummaryRanges() {
        list.add(head);
        list.add(tail);
    }

    public void addNum(int val) {
        int n = list.size();
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + right + 1 >> 1;
            if (list.get(mid)[0] <= val) left = mid;
            else right = mid - 1;
        }
        int[] curr = new int[]{val, val};
        int[] prev = list.get(right);
        int[] next = list.get(right + 1);
        if ((prev[0] <= val && val <= prev[1]) || (next[0] <= val && val <= next[1])) {
            //pass
        } else if (prev[1] + 1 == val && val == next[0] - 1) {
            prev[1] = next[1];
            list.remove(next);
        } else if (prev[1] + 1 == val) {
            prev[1] = val;
        } else if (next[0] - 1 == val) {
            next[0] = val;
        } else {
            list.add(right + 1, curr);
        }
    }

    public int[][] getIntervals() {
        int n = list.size();
        int[][] ans = new int[n - 2][2];
        int idx = 0;
        for (int i = 1; i < n - 1; i++) {
            ans[idx++] = list.get(i);
        }
        return ans;
    }
}
