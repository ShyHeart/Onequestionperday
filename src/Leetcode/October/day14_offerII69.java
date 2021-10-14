package Leetcode.October;

//https://leetcode-cn.com/problems/B1IidL/
public class day14_offerII69 {

    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1, right = n - 1;
        while (left < right) {
            int mid = left + right + 1 >> 1;
            if (arr[mid - 1] < arr[mid]) left = mid;
            else right = mid - 1;
        }
        return right;
    }

}