package Leetcode.October;

//https://leetcode-cn.com/problems/minimum-moves-to-equal-array-elements/
public class day20_453 {
    public int minMoves(int[] nums) {
        int n = nums.length;
        long min = nums[0], sum = 0;
        for (int i : nums) {
            min = Math.min(min, i);
            sum += i;
        }
        return (int) (sum - min * n);
    }
}
