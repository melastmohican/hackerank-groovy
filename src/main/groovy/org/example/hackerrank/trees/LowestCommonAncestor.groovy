package org.example.hackerrank.trees

/**
 * You are given pointer to the root of the binary search tree and two values  and . You need to return the lowest common ancestor (LCA) of  and  in the binary search tree.
<pre>
     4
   /    \
  2      7
 / \    /
 1  3  6
</pre>
 In the above example, the lowest common ancestor of the nodes  and  is the node , as  is the lowest common node which has both the nodes  and  as it's descendants.

 You only need to complete the function.

 Input Format

 You are given a function,
<pre>
 node * lca (node * root ,int v1,int v2) {

 }
 </pre>
 It is guaranteed that v1 and v2 are present in the tree.

 Node is defined as :

<pre>
 struct node
 {
     int data;
     node * left;
     node * right;
 } node;
 </pre>
 Output Format

 Return the LCA of v1 and v2.

 Sample Input
<pre>
       4
    /    \
   2      7
  / \   /
 1  3  6
 </pre>
 v1 = 1 and v2 = 7.

 Sample Output

 LCA of 1 and 7 is 4 (which is the root).
 Return a pointer to the root in this case.
 */
class LowestCommonAncestor {
    Node lca(Node root, int v1, int v2) {
        if (!root) return null

        if (root.data < v1 && root.data < v2)
            return lca(root.right, v1, v2)
        if (root.data > v1 && root.data > v2)
            return lca(root.left, v1, v2)
        root
    }
}
