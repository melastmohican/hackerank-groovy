package org.example.hackerrank.trees

/**
 * The height of a binary tree is the number of edges between the tree's root and its furthest leaf. This means that a tree containing a single node has a height of .

 Complete the getHeight function provided in your editor so that it returns the height of a binary tree. This function has a parameter, , which is a pointer to the root node of a binary tree.
 Note -The Height of binary tree with single node is taken as zero.

 Input Format

 You do not need to read any input from stdin. Our grader will pass the root node of a binary tree to your getHeight function.

 Output Format

 Your function should return a single integer denoting the height of the binary tree.

 Sample Input
  {@code
        3
    2      5
 1      4       6
                    7
  }
 Note: A binary search tree is a binary tree in which the value of each parent node's left child is less than the value the parent node, and the value of the parent node is less than the value of its right child.

 Sample Output

 3
 */
class BinaryTreeHeight {
    int height(Node root) {
        if (!root) {
            return -1
        } else {
            return 1 + Math.max(height(root.left), height(root.right))
        }
    }
}
