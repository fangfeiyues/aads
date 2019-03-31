package com.fang.aads.algo.sort;

/**
 * 快速排序：把基点拿出留下这个空位
 * 如何在O(n)的时间复杂度内查找到一个无序的数组中的第K大元素？
 * 时间复杂度 O(nlogn) 极端情况下O(n^2)
 */
public class QuickSort {
    /**
     * 递推公式：
     * quick_sort(p…r) = quick_sort(p…q-1) + quick_sort(q+1, r)
     * <p>
     * 终止条件：
     * p >= r
     */

    /**
     * 分区函数的思想是，在原地排序基础上 取i,j两个浮点，a[p...i-1]都是处理的 后面未处理。
     * 遍历到比pivot大的i不动 j继续后移；遇到小于的 则交换到i位置同时i,j都后移
     * 因为涉及到交换操作 所以快拍不稳定
     *
     * @param a
     * @param p
     * @param r
     */

    private void partition(int[] a, int p, int r) {

        // 拿到分区数
        int pivot = a[r];


    }


}
