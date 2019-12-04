package com.fang.aads.algo.graph;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * �����������
 * �ҵ���̵��߼������㰴�����Ǻ�s�ľ��������뿪���У�ֻҪ��һ�α�ǹ��ľ������·����
 *
 * @author by Feiyue on 2019/12/4 3:00 PM
 */
public class BreadthFirstPaths {

    private boolean[] marked;

    private int[] edgeTo;

    private final int s = 0; // ���


    public boolean hasPathTo(int v) {
        return marked[v];
    }

    private void bfs(Graph G, int s) throws InterruptedException {
        // ��v��ʼ���ڽӱ����
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
        marked[s] = true;
        queue.put(s);

        while (!queue.isEmpty()) {
            int v = queue.peek();
            for (Integer w : G.adj(v)) {
                if (!marked[w]) {
                    marked[w] = true;
                    // ��ȥw����v
                    edgeTo[w] = v;
                    queue.put(w);
                }
            }
        }

    }

    public Iterable<Integer> pathTo(int v) {

        // �����s��ʼ��ɢ
        if (!hasPathTo(v)) {
            return null;
        }

        Stack<Integer> path = new Stack<>();

        //��v��ʼ��ǰ���� �ﵽv(edge[v])����˭ ֱ�����s
        for (int x = v; x != s; x = edgeTo[x]) {
            // �����Ƚ����
            path.push(x);
        }

        path.push(s);
        return path;
    }
}
