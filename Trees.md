## Swap Nodes [Algo]

A binary tree is a tree which is characterized by any one of the following properties:

It can be an empty (null).
It contains a root node and two subtrees, left subtree and right subtree. These subtrees are also binary tree.
Inorder traversal is performed as

Traverse the left subtree.
Visit root (print it).
Traverse the right subtree.
(For an Inorder traversal, start from the root and keep visiting the left subtree recursively until you reach the leaf,then you print the node at which you are and then you visit the right subtree.)

We define depth of a node as follow:

Root node is at depth 1.
If the depth of parent node is d, then the depth of current node will be d+1.
Swapping: Swapping subtrees of a node means that if initially node has left subtree L and right subtree R, then after swapping left subtree will be R and right subtree L.

Eg. In the following tree, we swap children of node 1.

                                Depth
    1               1            [1]
   / \             / \
  2   3     ->    3   2          [2]
   \   \           \   \
    4   5           5   4        [3]
Inorder traversal of left tree is 2 4 1 3 5 and of right tree is 3 5 1 2 4.

Swap operation: Given a tree and a integer, K, we have to swap the subtrees of all the nodes who are at depth h, where h ∈ [K, 2K, 3K,...].

You are given a tree of N nodes where nodes are indexed from [1..N] and it is rooted at 1. You have to perform T swap operations on it, and after each swap operation print the inorder traversal of the current state of the tree.

Input Format 
First line of input contains N, number of nodes in tree. Then N lines follow. Here each of ith line (1 <= i <= N) contains two integers, a b, where a is the index of left child, and b is the index of right child of ith node. -1 is used to represent null node. 
Next line contain an integer, T. Then again T lines follows. Each of these line contains an integer K.

Output Format 
For each K, perform swap operation as mentioned above and print the inorder traversal of the current state of tree.

Constraints 
1 <= N <= 1024 
1 <= T <= 100 
1 <= K <= N 
Either a = -1 or 2 <= a <= N 
Either b = -1 or 2 <= b <= N 
Index of (non-null) child will always be greater than that of parent.

Sample Input #00

3
2 3
-1 -1
-1 -1
2
1
1
Sample Output #00

3 1 2
2 1 3
Sample Input #01

5
2 3
-1 4
-1 5
-1 -1
-1 -1
1
2
Sample Output #01

4 2 1 5 3
Sample Input #02

11
2 3
4 -1
5 -1
6 -1
7 8
-1 9
-1 -1
10 11
-1 -1
-1 -1
-1 -1
2
2
4
Sample Output #02

2 9 6 4 1 3 7 5 11 8 10
2 6 9 4 1 3 7 5 10 8 11
Explanation

**[s] represents swap operation is done at this depth.

Test Case #00: As node 2 and 3 has no child, swapping will not have any effect on it. We only have to swap the child nodes of root node.

    1   [s]       1    [s]       1   
   / \      ->   / \        ->  / \  
  2   3 [s]     3   2  [s]     2   3
Test Case #01: Swapping child nodes of node 2 and 3 we get

    1                  1  
   / \                / \ 
  2   3   [s]  ->    2   3
   \   \            /   / 
    4   5          4   5  
Test Case #02: Here we perform swap operations at the nodes whose depth is either 2 and 4 and then at nodes whose depth is 4.

         1                     1                          1             
        / \                   / \                        / \            
       /   \                 /   \                      /   \           
      2     3    [s]        2     3                    2     3          
     /      /                \     \                    \     \         
    /      /                  \     \                    \     \        
   4      5          ->        4     5          ->        4     5       
  /      / \                  /     / \                  /     / \      
 /      /   \                /     /   \                /     /   \     
6      7     8   [s]        6     7     8   [s]        6     7     8
 \          / \            /           / \              \         / \   
  \        /   \          /           /   \              \       /   \  
   9      10   11        9           11   10              9     10   11 


## Kitty's Calculations on a Tree

Kitty has a tree, , consisting of  nodes where each node is uniquely labeled from  to . Her friend Alex gave her  sets, where each set contains  distinct nodes. Kitty needs to calculate the following expression on each set:

where:

 denotes an unordered pair of nodes belonging to the set.
 denotes the number of edges on the unique path between nodes  and .
Given  and  sets of  distinct nodes, can you help her calculate the expression for each set? For each set of nodes, print the value of the expression modulo  on a new line.

Input Format

The first line contains two space-separated integers describing the respective values of  (the number of nodes in tree ) and  (the number of sets). 
Each of the  subsequent lines contains two space-separated integers,  and , describing an undirected edge between nodes  and . 
The  subsequent lines define each set over two lines in the following format:

The first line contains an integer, , denoting the size of the set.
The second line contains  space-separated integers describing the set's elements.
Constraints

The sum of  over all  does not exceed .
All elements in each set are distinct.
Subtasks

 for  of the maximum score.
 for  of the maximum score.
 for  of the maximum score.
Output Format

Print  lines of output where each line  contains the expression for the  query, modulo .

Sample Input 0

7 3
1 2
1 3
1 4
3 5
3 6
3 7
2
2 4
1
5
3
2 4 5
Sample Output 0

16
0
106

## Is This a Binary Search Tree?

For the purposes of this challenge, we define a binary tree to be a binary search tree with the following ordering requirements:

The  value of every node in a node's left subtree is less than the data value of that node.
The  value of every node in a node's right subtree is greater than the data value of that node.
Given the root node of a binary tree, can you determine if it's also a binary search tree?

Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree. It must return a boolean denoting whether or not the binary tree is a binary search tree. You may have to write one or more helper functions to complete this challenge.

Input Format

You are not responsible for reading any input from stdin. Hidden code stubs will assemble a binary tree and pass its root node to your function as an argument.

Constraints

Output Format

You are not responsible for printing any output to stdout. Your function must return true if the tree is a binary search tree; otherwise, it must return false. Hidden code stubs will print this result as a Yes or No answer on a new line.

Sample Input

tree

Sample Output

No

## Square-Ten Tree

The square-ten tree decomposition of an array is defined as follows:

The lowest () level of the square-ten tree consists of single array elements in their natural order.
The  level (starting from ) of the square-ten tree consists of subsequent array subsegments of length in their natural order. Thus, the  level contains subsegments of length , the  level contains subsegments of length , the  level contains subsegments of length , etc.
In other words, every  level (for every ) of square-ten tree consists of array subsegments indexed as:

Level  consists of array subsegments indexed as .
The image below depicts the bottom-left corner (i.e., the first  array elements) of the table representing a square-ten tree. The levels are numbered from bottom to top:

4x128 square-ten tree table

Task 
Given the borders of array subsegment , find its decomposition into a minimal number of nodes of a square-ten tree. In other words, you must find a subsegment sequence  such as for every , , , where every  belongs to any of the square-ten tree levels and  is minimal amongst all such variants.

Input Format

The first line contains a single integer denoting . 
The second line contains a single integer denoting .

Constraints

The numbers in input do not contain leading zeroes.
Output Format

As soon as array indices are too large, you should find a sequence of  square-ten tree level numbers, , meaning that subsegment  belongs to the  level of the square-ten tree.

Print this sequence in the following compressed format:

On the first line, print the value of  (i.e., the compressed sequence block count).
For each of the  subsequent lines, print  space-separated integers,  and  (, ), meaning that the number  appears consequently  times in sequence . Blocks should be listed in the order they appear in the sequence. In other words,  should be equal to ,  should be equal to , etc.
Thus  must be true and  must be true for every . All numbers should be printed without leading zeroes.

Sample Input 0

1
10
Sample Output 0

1
1 1

## Balanced Forest

Greg received an -node tree as a graduation gift, where each node  contains  coins. He wants to insert exactly one new node, , into the tree using the following process:

Select a node, , where .
Create a new edge connecting node  to a new node, .
Add  coins to node  (this can be any non-negative integer).
Now that Greg's tree has  nodes, he wants to cut two of its edges to create a forest of  trees where each tree contains an equal number of coins. If such a configuration is possible, he calls it a balanced forest.

For each tree Greg receives as a gift, determine the minimum value of  such that the tree can be split into a balanced forest (meaning that each of the forest's three trees have the same number of coins); if no  exists that enables Greg to create a balanced forest, print  instead.

Input Format

The first line contains a single integer, , denoting the number of trees gifted to Greg. The subsequent lines describe each query in the following format:

The first line contains an integer, , denoting the number of nodes in the tree.
The second line contains  space-separated integers describing the respective values of , where each  denotes the number of coins at node .
Each line  of the  subsequent lines contains two space-separated integers,  and  (where ), describing edge  connecting nodes  and .
Note: It is guaranteed that each query forms a valid undirected tree.

Constraints

Subtasks

For  of the maximum score:

For  of the maximum score:

Output Format

For each query, print the minimum value of  on a new line; if no such value exists, print  instead.

Sample Input

2
5
1 2 2 1 1
1 2
1 3
3 5
1 4
3
1 3 5
1 3
1 2
Sample Output

2
-1
Explanation

We perform the following two queries:

The tree initially looks like this: 
q1 initial tree
Greg can add a new node  with  coins and create a new edge connecting nodes  and . Then he cuts the edge connecting nodes  and  and the edge connecting nodes  and . We now have a three-tree forest, where each tree has  coins. 
q1 cut tree
In the second query, it's impossible to add a node in such a way that we can split the tree into a three-tree forest where each tree has an equal number of coins, so we print .

## Jenny's Subtrees

Jenny loves experimenting with trees. Her favorite tree has  nodes connected by  edges, and each edge is  unit in length. She wants to cut a subtree (i.e., a connected part of the original tree) of radius  from this tree by performing the following two steps:

Choose a node, , from the tree.
Cut a subtree consisting of all nodes which are not further than  units from node .
For example, the blue nodes in the diagram below depict a subtree centered at  that has radius :

image

Given , , and the definition of Jenny's tree, find and print the number of different subtrees she can cut out. Two subtrees are considered to be different if they are not isomorphic.

Input Format

The first line contains two space-separated integers denoting the respective values of  and . 
Each of the next  subsequent lines contains two space-separated integers,  and , describing a bidirectional edge in Jenny's tree having length .

Constraints

Subtasks

For  of the max score:

Output Format

Print the total number of different possible subtrees.

Sample Input 0

7 1
1 2
1 3
1 4
1 5
2 6
2 7
Sample Output 0

3
Explanation 0

In the diagram below, blue nodes denote the possible subtrees:

image

The last  subtrees are considered to be the same (i.e., they all consist of two nodes connected by one edge), so we print  as our answer.

Sample Input 1

7 3
1 2
2 3
3 4
4 5
5 6
6 7
Sample Output 1

4

## Tree Coordinates

We consider metric space to be a pair, , where  is a set and  such that the following conditions hold:

where  is the distance between points  and .

Let's define the product of two metric spaces, , to be  such that:

, where , .
So, it follows logically that  is also a metric space. We then define squared metric space, , to be the product of a metric space multiplied with itself: .

For example, , where  is a metric space. , where .

In this challenge, we need a tree-space. You're given a tree, , where  is the set of vertices and  is the set of edges. Let the function  be the distance between two vertices in tree  (i.e.,  is the number of edges on the path between vertices  and ). Note that  is a metric space.

You are given a tree, , with  vertices, as well as  points in . Find and print the distance between the two furthest points in this metric space!

Input Format

The first line contains two space-separated positive integers describing the respective values of  (the number of vertices in ) and  (the number of given points). 
Each line  of the  subsequent lines contains two space-separated integers,  and , describing edge  in . 
Each line  of the  subsequent lines contains two space-separated integers describing the respective values of and  for point .

Constraints

Scoring

This challenge uses binary scoring, so you must pass all test cases to earn a positive score.

Output Format

Print a single non-negative integer denoting the maximum distance between two of the given points in metric space .

Sample Input 0

2 2
1 2
1 2
2 1
Sample Output 0

2
Explanation 0

The distance between points  and  is .

Sample Input 1

7 3
1 2
2 3
3 4
4 5
5 6
6 7
3 6
4 5
5 5
Sample Output 1

3

## Array Pairs

Consider an array of  integers, . Find and print the total number of  pairs such that  where .

Input Format

The first line contains an integer, , denoting the number of elements in the array. 
The second line consists of  space-separated integers describing the respective values of .

Constraints

Scoring

 for  of the test cases.
 for  of the test cases.
 for  of the test cases.
Output Format

Print a long integer denoting the total number  pairs satisfying  where .

Sample Input

5  
1 1 2 4 2
Sample Output

8
