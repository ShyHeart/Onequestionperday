package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/15 9:44
 */

//https://leetcode-cn.com/problems/find-peak-element/
public class day15_findPeakElement162 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
