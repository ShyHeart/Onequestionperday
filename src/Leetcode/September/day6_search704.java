package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/7 14:04
 */

//https://leetcode-cn.com/problems/binary-search/
public class day6_search704 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            } else {//target<=nums[mid])
                right = mid;
            }
        }
        //循环结束后 left=right
        if (nums[right] == target) return right;
        return -1;
    }

}
