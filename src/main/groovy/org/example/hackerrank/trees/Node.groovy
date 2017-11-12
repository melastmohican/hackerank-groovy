package org.example.hackerrank.trees

/**
 * Binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.
 */
class Node {
    int data;
    Node left
    Node right

    private static Node createNode(int[] a, int i) {
        if (i < a.length && a[i] > 0) {
            Node node = new Node()
            node.data = a[i]
            node.left = createNode(a, 2 * i + 1)
            node.right = createNode(a, 2 * i + 2)
            return node
        }
        return null;
    }

    /**
     * Eytzinger's method to create a complete binary tree from an array.
     * @param a
     * @return
     */
    static def fromArray(int[] a) {
        Node root = createNode(a, 0);
        return root
    }

    private static makeArray(Node node, int i, a) {
        if (node) {
            a[i] = node.data
            makeArray(node.getLeft(), 2 * i + 1, a)
            makeArray(node.getRight(), 2 * i + 2, a)
        }
    }

    /**
     * Eytzinger's method to represent a complete binary tree as an array.
     * @param root
     * @return
     */
    static def toArray(Node root) {
        def result = []
        if (root) {
            makeArray(root, 0, result);
        }
        result as int[]
    }

    static def left(a, int i, int v) {
        def idx = (2 * i) + 1
        a[idx] = v
        idx
    }

    static def right(a, int i, int v) {
        def idx = (2 * i) + 2
        a[idx] = v
        idx
    }

}
