package com.fang.aads.algo.graph;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 广度优先搜索
 * 找到最短的逻辑：顶点按照他们和s的距离加入或离开队列，只要第一次标记过的就是最短路径。
 *
 * @author by Feiyue on 2019/12/4 3:00 PM
 */
public class BreadthFirstPaths {

    private boolean[] marked;

    private int[] edgeTo;

    private final int s = 0; // 起点


    public boolean hasPathTo(int v) {
        return marked[v];
    }

    private void bfs(Graph G, int s) throws InterruptedException {
        // 从v开始的邻接表遍历
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
        marked[s] = true;
        queue.put(s);

        while (!queue.isEmpty()) {
            int v = queue.peek();
            for (Integer w : G.adj(v)) {
                if (!marked[w]) {
                    marked[w] = true;
                    // 能去w的是v
                    edgeTo[w] = v;
                    queue.put(w);
                }
            }
        }

    }

    public Iterable<Integer> pathTo(int v) {

        // 由起点s开始发散
        if (!hasPathTo(v)) {
            return null;
        }

        Stack<Integer> path = new Stack<>();

        //从v开始向前倒推 达到v(edge[v])的是谁 直到起点s
        for (int x = v; x != s; x = edgeTo[x]) {
            // 讲究先进后出
            path.push(x);
        }

        path.push(s);
        return path;
    }
}
