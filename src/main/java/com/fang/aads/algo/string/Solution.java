package com.fang.aads.algo.string;

/**
 * @author created by fang on 2020/5/19/019 23:05
 */
public class Solution {

    /**
     * ����һ���ǿ��ַ��� s�����ɾ��һ���ַ����ж��Ƿ��ܳ�Ϊ�����ַ���
     * <p>
     * ������: ��������������һ���������������������֣�98789���������������98789 ����Ҳ��98789��ż��������3223Ҳ�ǻ���������ĸ abcba Ҳ�ǻ���
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
