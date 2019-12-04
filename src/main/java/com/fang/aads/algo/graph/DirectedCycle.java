package com.fang.aads.algo.graph;

import java.util.Stack;

/**
 * 有向图是否有环检测：一旦我们找到了一条有向边v->w且w已经存在于栈中就找到一个环了
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
