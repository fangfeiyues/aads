package com.fang.aads.dst.linked;

/**
 * created by fang on 2018/12/8/008 18:31
 */
public class LinkedCode {


    /**
     * 反转链表（非递归）
     */
    public void reverse() {


    }

    /**
     * 反转链表（递归）
     */
    public void reverseWithRecursion() {


    }


    /**
     * 链表中环的检测
     */
    public void checkRing() {


    }


    /**
     * 两个有序的链表合并
     */
    public void mergeSort() {


    }

    /**
     * 单向链表删除倒数第n个结点
     */
    public void deleteLastN() {

    }

    /**
     * 单向拿取链表的中间结点
     */
    public void getMiddleNode() {


    }

    static Node readyNode() {
        Node linkNode1 = new Node();
        linkNode1.data = 1;
        Node linkNode2 = new Node();
        linkNode2.data = 2;
        Node linkNode3 = new Node();
        linkNode3.data = 3;
        Node linkNode4 = new Node();
        linkNode4.data = 4;
        Node linkNode5 = new Node();
        linkNode5.data = 5;
        Node linkNode6 = new Node();
        linkNode6.data = 6;
        linkNode1.next = linkNode2;
        linkNode2.next = linkNode3;
        linkNode3.next = linkNode4;
        linkNode4.next = linkNode5;
        linkNode5.next = linkNode6;
        return linkNode1;
    }

}
