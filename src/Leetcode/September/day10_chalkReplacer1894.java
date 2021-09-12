package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/10 10:28
 */

//https://leetcode-cn.com/problems/find-the-student-that-will-replace-the-chalk/
public class day10_chalkReplacer1894 {

    public int chalkReplacer(int[] chalk, int k) {
        //先求出前缀和
        for (int i = 0; i < chalk.length; i++) {
            chalk[i] = chalk[i] + (i - 1 < 0 ? 0 : chalk[i - 1]);
            //求前缀和的过程中比k大就直接返回
            if (chalk[i] > k) {
                return i;
            }
        }
        //k对chalk取余,前缀和最后一个元素就是总和
        k = k % chalk[chalk.length - 1];
        int left = 0, right = chalk.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            //严格比k大，所以不加等号
            if (chalk[mid] > k) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
