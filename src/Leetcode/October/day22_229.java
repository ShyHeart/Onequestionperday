package Leetcode.October;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class day22_229 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        List<Integer> ans = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) > n / 3) ans.add(i);
        }
        return ans;
    }

}
