package com.fang.aads.algo.sort;

/**
 * created by fang on 2019/4/3/003 22:18
 * O(n)查找第K大的元素
 */
public class KthTop {


    /**
     * 利用快排的归并思想
     * 1.找到p
     * 2.合并
     *
     * @param a
     * @return
     */
    private static int getKth(int[] a, int k) {
        if (a == null || a.length < k) {
            return -1;
        }

        int partition = partition(a, 0, a.length - 1);
        while (partition + 1 != k) {
            if (partition + 1 < k) {
                partition = partition(a, partition + 1, a.length - 1);
            } else {
                partition = partition(a, 0, partition - 1);
            }
        }

        return a[partition];
    }


    private static int partition(int[] a, int p, int r) {
        int i = p;
        int value = a[r];
        for (int j = p; j < r; j++) {
            //
            if (a[j] <= value) {
                swap(a, i, j);
                i++;
            }
        }

        // 交换
        swap(a, i, r);
        return i;
    }

    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2};
        System.out.println(KthTop.getKth(a, 2));

    }
}
