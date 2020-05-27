package com.fang.aads.algo.string;

import java.util.LinkedList;

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

    /**
     * 给定一个经过编码的字符串，返回它解码后的字符串。
     * <p>
     * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/decode-string
     *
     * @param s sd3[qa5[op]ry]
     * @return
     */
    public String decodeString(String s) {

        // 1.栈
        LinkedList<String> stk = new LinkedList<>();
        int cur = 0;
        while (cur < s.length()) {
            char chars = s.charAt(cur);

            // 字母入栈
            if (Character.isDefined(chars)) {
                stk.addLast(chars);

            }
        }


        return "";
    }


    public static void main(String[] args) {


    }

}
