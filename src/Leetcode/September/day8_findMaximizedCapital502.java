package Leetcode.September;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @作者 Heart
 * @时间 2021/9/8 14:18
 */

//https://leetcode-cn.com/problems/ipo/
public class day8_findMaximizedCapital502 {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        // 按纯利从大到小
        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[][] project = new int[n][2];
        for (int i = 0; i < n; i++) {
            project[i][0] = profits[i];
            project[i][1] = capital[i];
        }
        // 按成本从小到大
        Arrays.sort(project, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        for (int i = 0; k-- > 0; ) {
            while (i < n && project[i][1] <= w) {
                heap.add(project[i++][0]);
            }
            if (heap.isEmpty()) return w;
            w += heap.poll();
        }
        return w;
    }
}
