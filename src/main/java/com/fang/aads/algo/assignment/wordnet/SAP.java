package com.fang.aads.algo.assignment.wordnet;

import edu.princeton.cs.algs4.Digraph;

/**
 * @author by Feiyue on 2019/12/9 4:43 PM
 */
public class SAP {

    /**
     * constructor takes a digraph (not necessarily a DAG)
     *
     * @param G
     */
    public SAP(Digraph G) {


    }

    /**
     * length of shortest ancestral path between v and w; -1 if no such path
     *
     * @param v
     * @param w
     * @return
     */
    public int length(int v, int w) {

        return -1;
    }

    /**
     * a common ancestor of v and w that participates in a shortest ancestral path; -1 if no such path
     *
     * @param v
     * @param w
     * @return
     */
    public int ancestor(int v, int w) {

        return -1;
    }

    /**
     * length of shortest ancestral path between any vertex in v and any vertex in w; -1 if no such path
     *
     * @param v
     * @param w
     * @return
     */
    public int length(Iterable<Integer> v, Iterable<Integer> w) {

        return -1;
    }

    /**
     * a common ancestor that participates in shortest ancestral path; -1 if no such path
     *
     * @param v
     * @param w
     * @return
     */
    public int ancestor(Iterable<Integer> v, Iterable<Integer> w) {

        return -1;
    }

    /**
     * do unit testing of this class
     *
     * @param args
     */
    public static void main(String[] args) {

    }
}
