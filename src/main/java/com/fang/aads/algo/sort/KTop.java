package com.fang.aads.algo.sort;

import java.util.Random;

/**
 * created by fang on 2019/4/3/003 23:02
 * 1亿个数里面最小的10个
 */
public class KTop {

    private static Random random = new Random();

    // 1. 构建大顶堆


    public static void main(String[] args) {

        for (int i = 0; i < 1000000000; i++) {
            int tempNum = random.nextInt(Integer.MAX_VALUE);
        }
    }
}
