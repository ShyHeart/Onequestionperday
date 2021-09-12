package Leetcode.September;

/**
 * @作者 Heart
 * @时间 2021/9/7 14:05
 */

//https://leetcode-cn.com/problems/implement-rand10-using-rand7/
public class day5_rand10_470 {

    public int rand10() {
        while (true) {
            int num = (rand7() - 1) * 7 + rand7();
            // 如果在40以内，那就直接返回
            if (num <= 40) return 1 + num % 10;
            // 说明刚才生成的在41-49之间，利用随机数再操作一遍
            num = (num - 40 - 1) * 7 + rand7();
            if (num <= 60) return 1 + num % 10;
            // 说明刚才生成的在61-63之间，利用随机数再操作一遍
            num = (num - 60 - 1) * 7 + rand7();
            if (num <= 20) return 1 + num % 10;

        }


    }

    private int rand7() {
        return 0;
    }
}
