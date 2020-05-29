package com.fang.aads.algo.dynamic;

/**
 * @author by Feiyue on 2020/5/29 12:46 PM
 */
public class DynamicSolution {

    /**
     * ���������⡿
     * <p>
     * weight:��Ʒ������n:��Ʒ������w:�����ɳ�������
     *
     * @param weight
     * @param n
     * @param w
     * @return
     */
    public int knapsack(int[] weight, int n, int w) {

        // Ĭ��ֵfalse [n]��Ʒ������[w+1]�����ɳ��ܵ�����
        boolean[][] states = new boolean[n][w + 1];

        // ��һ�е�����Ҫ���⴦�����������ڱ��Ż�
        states[0][0] = true;

        //
        if (weight[0] <= w) {
            states[0][weight[0]] = true;
        }

        for (int i = 1; i < n; ++i) {
            // ��̬�滮״̬ת��
            for (int j = 0; j <= w; ++j) {
                // ���ѵ�i����Ʒ���뱳��
                // ����˵���ѵ�[i-1]�е����ݸ��Ʒ��뵽i��
                if (states[i - 1][j] == true) {
                    states[i][j] = states[i - 1][j];
                }
            }

            for (int j = 0; j <= w - weight[i]; ++j) {
                //�ѵ�i����Ʒ���뱳��
                if (states[i - 1][j] == true) {
                    states[i][j + weight[i]] = true;
                }
            }

        }

        for (int i = w; i >= 0; --i) {
            // ������
            if (states[n - 1][i] == true) {
                return i;
            }
        }
        return 0;
    }

}
