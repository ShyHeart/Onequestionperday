package Leetcode.September;

import java.util.HashMap;
import java.util.Map;

/**
 * @作者 Heart
 * @时间 2021/9/13 14:11
 */
//https://leetcode-cn.com/problems/number-of-boomerangs/
public class day13_numberOfBoomerangs447 {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int x = points[i][0] - points[j][0], y = points[i][1] - points[j][1];
                int dist = x * x + y * y;
                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }
            for (int dist : map.keySet()) {
                int cnt = map.get(dist);
                ans += cnt * (cnt - 1);
            }
        }
        return ans;
    }

}
