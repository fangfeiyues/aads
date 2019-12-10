package com.fang.aads.algo.assignment.wordnet;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.Digraph;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;

/**
 * @author by Feiyue on 2019/12/9 4:30 PM
 */
public class WordNet {

    /**
     * count & get
     */
    private ST<String, Bag<Integer>> bagST;

    private Digraph G;

    /**
     * constructor takes the name of the two input files
     *
     * @param synsets
     * @param hypernyms
     */
    public WordNet(String synsets, String hypernyms) {

        if (synsets == null || hypernyms == null) {
            throw new IllegalArgumentException("Arguments Error");
        }

        bagST = new ST<String, Bag<Integer>>();
        int count = 0;

        In synsetsIn = new In(synsets);
        while (synsetsIn.hasNextLine()) {

            String[] lines = synsetsIn.readLine().split(",");

            Bag<Integer> bag = new Bag<Integer>();
            bag.add(Integer.parseInt(lines[0]));
            bagST.put(lines[1], bag);

            count++;
        }

        G = new Digraph(count);
        In hypernymsIn = new In(hypernyms);
        while (hypernymsIn.hasNextLine()) {
            String[] lines = synsetsIn.readLine().split(",");
            int v = Integer.parseInt(lines[0]);
            for (int i = 1; i < lines.length; i++) {
                G.addEdge(v, Integer.parseInt(lines[i]));
            }
        }

    }

    /**
     * returns all WordNet nouns
     *
     * @return
     */
    public Iterable<String> nouns() {
        return bagST.keys();
    }

    /**
     * is the word a WordNet noun?
     *
     * @param word
     * @return
     */
    public boolean isNoun(String word) {
        if (word == null) {
            throw new IllegalArgumentException();
        }
        return bagST.contains(word);
    }

    /**
     * distance between nounA and nounB (defined below)
     *
     * @param nounA
     * @param nounB
     * @return
     */
    public int distance(String nounA, String nounB) {

        if (nounA == null || nounB == null || !isNoun(nounA) || !isNoun(nounB)) {
            throw new IllegalArgumentException();
        }

        SAP sap = new SAP(G);
        Bag<Integer> a = bagST.get(nounA);
        Bag<Integer> b = bagST.get(nounB);

        return sap.length(a, b);
    }

    /**
     * a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB in a shortest ancestral path (defined below)
     *
     * @param nounA
     * @param nounB
     * @return
     */
    public String sap(String nounA, String nounB) {

        return "";
    }

    /**
     * do unit testing of this class
     *
     * @param args
     */
    public static void main(String[] args) {


    }

}
