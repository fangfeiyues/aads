package com.fang.aads.dst.tree;

import com.alibaba.fastjson.JSON;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * created by fang on 2019/4/7/007 19:32
 * 遍历二叉树
 */
public class BinaryTreeForeach {


    /**
     * 非递归中序遍历: 构建栈
     *
     * @param root
     * @return
     */
    private static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    return list;
                }
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }
        }

    }


    /**
     * 前序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (root != null) {
                list.add(root.val);
                stack.add(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    return list;
                }
                root = stack.pop();
                root = root.right;
            }
        }
    }


    /**
     * 后序遍历
     *
     * @param root
     * @return
     */
    public static List<Integer> aftorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else {
                if (stack.isEmpty()) {
                    return list;
                }
                root = stack.pop();
                // 左右孩子都没有的时候加入list
                if (root.right == null) {
                    list.add(root.val);
                }
                root = stack.pop();
                root = root.right;

            }

        }
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(10);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(12);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = new TreeNode(11);
        TreeNode node6 = new TreeNode(9);
        TreeNode node7 = new TreeNode(13);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node5.right = node7;
        System.out.println(JSON.toJSONString(aftorderTraversal(node1)));

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
