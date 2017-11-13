package org.example.hackerrank.trees

/**
 * You are given a pointer to the root of a binary tree. Print the top view of the binary tree.
 Top view means when you look the tree from the top the nodes you will see will be called the top view of the tree. See the example below.
 You only have to complete the function.
 For example :

 1
 \
 2
 \
 5
 /  \
 3    6
 \
 4
 Top View : 1 -> 2 -> 5 -> 6

 Input Format

 You are given a function,
 {@code
 void topView(node * root) {

 }
 }
 Constraints

 1 Nodes in the tree  500

 Output Format

 Print the values on a single line separated by space.

 Sample Input

 1
 \
 2
 \
 5
 /  \
 3    6
 \
 4
 Sample Output

 1 2 5 6

 Explanation

 1
 \
 2
 \
 5
 /  \
 3    6
 \
 4
 From the top only nodes 1,2,5,6 will be visible.
 */
class TopView {
    def topView(Node root) {
        if(root) {
            Node curr = root
            def left = []
            while (curr) {
                left << curr
                curr = curr.left
            }

            while (left) {
                Node node = left.pop()
                print node.data + " "
            }

            curr = root.right
            while (curr) {
                print curr.data + " "
                curr = curr.right
            }
        }
    }
}