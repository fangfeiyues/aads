package com.fang.aads.algo.sort;

/**
 * 快速排序：把基点拿出留下这个空位 如何在O(n)的时间复杂度内查找到一个无序的数组中的第K大元素？ 时间复杂度 O(nlogn) 极端情况下O(n^2)
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
     * 分区函数1的思想是，在原地排序基础上 取i,j两个浮点，a[p...i-1]都是处理的 后面未处理。 遍历到比pivot大的i不动 j继续后移；
     * 遇到小于的 则交换到i位置同时i,j都后移 因为涉及到交换操作 所以快拍不稳定
     *
     * @param a
     * @param p
     * @param r
     */

    private void partition(int[] a, int p, int r) {

        // 拿到分区数
        int pivot = a[r];

    }

    /**
     * 分区思想2：取第一个为分区点，i,j不同的作为两段游标不断前移。 i遇到大于p值的则停止，j遇到小于p值的同样停下。同时交换两者
     *
     * @param a
     * @param p 起始节点
     * @param r 终止节点
     */
    private void partition2(int[] a, int p, int r) {
        int i = p;
        // r+1 ?? 在--j的时候略过第一位
        int j = r + 1;
        while (true) {
            while (a[++i] > a[p] && i < r) {}
            while (a[--j] < a[p] && j > p) {}
            if (i >= j) {
                break;
            }
            swap(a, i, j);
        }
        swap(a, p, j);
    }

    /**
     * 交换
     *
     * @param a
     * @param i
     * @param j
     */
    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
