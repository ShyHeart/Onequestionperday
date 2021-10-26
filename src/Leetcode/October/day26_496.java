package Leetcode.October;

public class day26_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < m && nums1[i] != nums2[j]) j++;
            while (j < m && nums1[i] >= nums2[j]) j++;
            ans[i] = j < m ? nums2[j] : -1;
        }
        return ans;
    }

}
