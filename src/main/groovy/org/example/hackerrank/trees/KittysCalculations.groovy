package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankExecutable

/**
 * Kitty has a tree, , consisting of  nodes where each node is uniquely labeled from  to . Her friend Alex gave her  sets, where each set contains  distinct nodes. Kitty needs to calculate the following expression on each set:

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
 */
class KittysCalculations implements HackerRankExecutable {

    static class Node {
        List<Node> children = []
        int data
        int level
        Node parent

        static Node find(Node root, int value) {
            if (!root) return root
            if (root.data == value) return root

            Node result = null
            for (Node child : root.children) {
                if (child.data == value) {
                    return child
                } else {
                    result = find(child, value)
                    if (result) return result
                }
            }
            return result;
        }

        static int dist(Node a, Node b) {
            Node c = ancestor(a, b)
            return a.level + b.level - 2 * c.level
         }

        static Node ancestor(Node a, Node b) {
            if (!a) return b
            else if (!b) return a

            Node trava = a
            Node travb = b

            while (trava.parent || travb.parent) {
                if (trava.level == travb.level) {
                    if (trava.parent == travb.parent)
                        return trava.parent
                    trava = trava.parent
                    travb = travb.parent
                } else if (trava.level > travb.level) {
                    if (trava.parent == travb) return travb
                    trava = trava.parent;
                } else if (trava.level < travb.level) {
                    if (trava == travb.parent) return trava
                    travb = travb.parent;
                }
            }
            if (trava)
                return trava
            else
                return travb
        }

    }

    Node read(Scanner sc, int n) {
        Node root = new Node()
        root.data = 1
        root.level = 0
        root.parent = null

        (1..<n).each {
            int a = sc.nextInt()
            int b = sc.nextInt()
            Node nodeB = new Node()
            nodeB.data = b
            Node nodeA = Node.find(root, a)
            if (nodeA) {
                nodeA.children << nodeB
                nodeB.parent = nodeA
                nodeB.level = nodeA.level + 1
            }
        }
        root
    }

    int calc(int[] arr, Node root) {
        int sum = 0
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[i] * arr[j] * Node.dist(Node.find(root,arr[i]), Node.find(root, arr[j]))
            }
        }
        sum % (10**9 + 7)
    }

    @Override
    def execute() {
        new Scanner(System.in).withCloseable { sc ->
            int n = sc.nextInt();
            int q = sc.nextInt();
            Node root = read(sc, n)
            (1..q).each {
                def a = []
                int k = sc.nextInt()
                (1..k).each {
                    a << sc.nextInt()
                }
                println(calc(a as int[], root))
            }
        }
    }
}
