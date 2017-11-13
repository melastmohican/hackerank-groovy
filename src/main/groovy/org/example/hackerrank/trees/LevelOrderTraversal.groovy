package org.example.hackerrank.trees

/**
 * You are given a pointer to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. You only have to complete the function. For example:

 1
 \
 2
 \
 5
 /  \
 3    6
 \
 4
 For the above tree, the level order traversal is 1 -> 2 -> 5 -> 3 -> 6 -> 4.

 Input Format

 You are given a function,

 void levelOrder(node * root) {

 }
 Constraints

 1 Nodes in the tree  500

 Output Format

 Print the values in a single line separated by a space.

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

 1 2 5 3 6 4
 */
class LevelOrderTraversal {
    def levelOrder(Node root) {
        if(root) {
            def q = [] as Queue
            q << root
            while(q) {
                Node current = q.poll()
                print current.data + " "
                if(current.left) {
                    q << current.left
                }
                if(current.right) {
                    q << current.right
                }
            }

        }

    }
}
