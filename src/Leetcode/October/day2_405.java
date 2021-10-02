package Leetcode.October;

/**
 * @作者 Heart
 * @时间 2021/10/2 19:53
 */
//https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/
public class day2_405 {
    public String toHex(int num) {
        if (num == 0) return "0";
        long _num = num;
        StringBuilder sb = new StringBuilder();
        if (_num < 0) _num = (long) (Math.pow(2, 32) + _num);
        while (_num != 0) {
            long i = _num % 16;
            char c = (char) (i + '0');
            if (i >= 10) c = (char) (i - 10 + 'a');
            sb.append(c);
            _num /= 16;
        }
        return sb.reverse().toString();
    }
}
