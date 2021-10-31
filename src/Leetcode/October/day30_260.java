package Leetcode.October;

import java.util.HashMap;
import java.util.Map;

public class day30_260 {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        int[] ans = new int[2];
        int idx = 0;
        for (int i : nums) {
            if (map.get(i) == 1) ans[idx++] = i;
        }
        return ans;
    }
}
