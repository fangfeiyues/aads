package com.fang.aads.algo.graph;

import java.util.Stack;

/**
 * ����ͼ�Ƿ��л���⣺һ�������ҵ���һ�������v->w��w�Ѿ�������ջ�о��ҵ�һ������
 *
 * @author by Feiyue on 2019/12/4 4:29 PM
 */
public class DirectedCycle {

    private boolean[] marked;

    private int[] edgeTo;

    private Stack<Integer> cycle;

    private boolean[] onStack;


    private void dfs(Digraph G, int v) {
        onStack[v] = true;
        marked[v] = true;


    }

}
