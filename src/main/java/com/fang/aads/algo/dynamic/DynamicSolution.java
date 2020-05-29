package com.fang.aads.algo.dynamic;

/**
 * @author by Feiyue on 2020/5/29 12:46 PM
 */
public class DynamicSolution {

    /**
     * 【背包问题】
     * <p>
     * weight:物品重量，n:物品个数，w:背包可承载重量
     *
     * @param weight
     * @param n
     * @param w
     * @return
     */
    public int knapsack(int[] weight, int n, int w) {

        // 默认值false [n]物品个数；[w+1]背包可承受的重量
        boolean[][] states = new boolean[n][w + 1];

        // 第一行的数据要特殊处理，可以利用哨兵优化
        states[0][0] = true;

        //
        if (weight[0] <= w) {
            states[0][weight[0]] = true;
        }

        for (int i = 1; i < n; ++i) {
            // 动态规划状态转移
            for (int j = 0; j <= w; ++j) {
                // 不把第i个物品放入背包
                // 简单来说：把第[i-1]行的数据复制放入到i行
                if (states[i - 1][j] == true) {
                    states[i][j] = states[i - 1][j];
                }
            }

            for (int j = 0; j <= w - weight[i]; ++j) {
                //把第i个物品放入背包
                if (states[i - 1][j] == true) {
                    states[i][j + weight[i]] = true;
                }
            }

        }

        for (int i = w; i >= 0; --i) {
            // 输出结果
            if (states[n - 1][i] == true) {
                return i;
            }
        }
        return 0;
    }

}
