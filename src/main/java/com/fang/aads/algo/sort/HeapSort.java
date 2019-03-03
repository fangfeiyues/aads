package com.fang.aads.algo.sort;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * created by fang on 2019/1/9/009 21:01
 * 堆排序需要满足两点：
 * 1.是一个完全二叉树
 * 2.堆中每个节点的值都必须大于等于（小于等于）子节点的值
 * <p>
 * 应用：优先队列PriorityQueue， Top K，中位数
 */
public class HeapSort {


    public void priorityQueueTest() {


    }

    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("q");
        priorityQueue.add("a");
        priorityQueue.add("c");
        priorityQueue.add("v");
        Iterator<String> it = priorityQueue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
