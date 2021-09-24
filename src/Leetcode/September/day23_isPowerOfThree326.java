package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/24 8:35
 */

//https://leetcode-cn.com/problems/power-of-three/
public class day23_isPowerOfThree326 {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;
    }

}
