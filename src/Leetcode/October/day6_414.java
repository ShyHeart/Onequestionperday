package Leetcode.October;

import java.util.*;

/**
 * @作者 Heart
 * @时间 2021/10/6 9:51
 */

//https://leetcode-cn.com/problems/third-maximum-number/
public class day6_414 {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size() < 3 ? list.get(list.size() - 1) : list.get(list.size() - 3);
    }
}
