package com.fang.aads.algo.string;

/**
 * @author created by fang on 2020/5/19/019 23:05
 */
public class Solution {

    /**
     * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串
     * <p>
     * 回文数: 就是正读倒读都一样的整数。如奇数个数字：98789，这个数字正读是98789 倒读也是98789。偶数个数字3223也是回文数。字母 abcba 也是回文
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.toCharArray()[i] != s.toCharArray()[length - 1 - i]) {

                if (s.toCharArray()[i + 1] == s.toCharArray()[length - 1 - i]) {
                    
                }
            }
        }
        return false;
    }
}
