package Leetcode.September;

import java.util.Arrays;

/**
 * @作者 Heart
 * @时间 2021/9/3 11:10
 */

//https://leetcode-cn.com/problems/smallest-k-lcci/
public class day3_smallestK_ms17_14 {
    public int[] smallestK(int[] arr, int k) {
        int[] nums = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            nums[i] = arr[i];
        }
        return nums;
    }

}
