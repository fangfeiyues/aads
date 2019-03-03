package com.fang.aads.algo.sort;

/**
 * created by fang on 2018/12/17/017 21:18
 * 归并排序：先把数组从中间分成前后两部分然后对前后部分分别排序再将排序好的重新组合在一起。
 * 这用到了分治的思想即分而治之，将一个大问题分解为多个小问题来解决。
 */
public class MergeSort {

    public static void mergeSort(int[] array) {

        int length = array.length;

        doMergeSort(array, 0, length - 1);

    }

    private static int[] doMergeSort(int[] array, int p, int r) {
        if (p + 1 == r) {
            if (array[p] > array[r]) {
                int temp = array[p];
                array[p] = array[r];
                array[r] = temp;
            }
            return array;
        }

        int q = (p + r) / 2;

        int[] a1 = doMergeSort(array, p, q);
        int[] a2 = doMergeSort(array, q + 1, r);
        merge(array, a1, a2);

        return array;
    }

    /**
     * 将两个有序的数组合并成一个
     *
     * @param array
     * @param a1
     * @param a2
     */
    public static void merge(int[] array, int[] a1, int[] a2) {
        // 游标v1,v2
        int k = 0;
        int j = 0;
        int v1 = a1[k];
        int v2 = a2[j];
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            if (v1 > v2) {
                array[i] = v2;
                if (j < a2.length - 1) {
                    j++;
                }
                v2 = a2[j];
            } else {
                array[i] = v1;
                if (k < a1.length - 1) {
                    k++;
                }
                v1 = a1[k];
            }
        }

    }

    private static void print(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
//        int a1[] = {1, 3, 5};
//        int a2[] = {2, 4, 6};
//        merge(a, a1, a2);
        mergeSort(a);
        print(a);
    }

}
