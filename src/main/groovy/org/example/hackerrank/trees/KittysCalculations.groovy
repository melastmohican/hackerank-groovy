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

    static final int MOD_VALUE = 10**9 + 7

    static class Node {
        int data
        Set<Node> connections = []

        def Node(int data) {
            this.data = data
        }
    }


    Node[] read(Scanner sc, int n) {
        Node[] nodes = new Node[n]
        (1..<n).each {
            int a = sc.nextInt()
            int b = sc.nextInt()
            if (nodes[a - 1] == null) {
                nodes[a - 1] = new Node(a)
            }
            if (nodes[b - 1] == null) {
                nodes[b - 1] = new Node(b);
            }
            nodes[a - 1].connections << nodes[b - 1]
            nodes[b - 1].connections << nodes[a - 1]
        }
        nodes
    }

    int distance(Node comingFrom, Node node, int num) {
        if (node.data == num) return 0

        boolean isFound = false
        int dist = 0
        for (Node nextNode : node.connections) {
            if (!nextNode.equals(comingFrom)) {
                int temp = distance(node, nextNode, num)
                if (temp != -1) {
                    dist = temp + 1
                    isFound = true
                }
            }
        }
        return isFound ? dist : -1;
    }

    def getPairs(int[] numArr) {
        def pairGroup = [] as List
        for (int i = 0; i < numArr.length; i++) {
            for (int j = i + 1; j < numArr.length; j++) {
                int[] group = [numArr[i], numArr[j]]
                pairGroup <<  group
            }
        }
        pairGroup
    }

    def distCache = [:]

    long calculate(Node[] nodes, int[] inputPair) {
        int u = inputPair[0]
        int v = inputPair[1]
        Long dist = distCache[inputPair]
        if(!dist) {
            dist = (long) (u * v * distance(null, nodes[u - 1], v))
            distCache << [(inputPair) : dist]
        }
        dist
    }

    int calc(int[] arr, Node[] nodes) {
        int sum = 0
        if (arr.length >= 2) {

            def pairs = getPairs(arr)
            def results = []
            pairs.each { int[] pair ->
                results << calculate(nodes, pair)
            }
            sum = results.sum() % MOD_VALUE
        }
        sum
    }

    @Override
    def execute() {
        new Scanner(System.in).withCloseable { sc ->
            int n = sc.nextInt();
            int q = sc.nextInt();
            Node[] nodes = read(sc, n)
            (1..q).each {
                def a = []
                int k = sc.nextInt()
                (1..k).each {
                    a << sc.nextInt()
                }
                println(calc(a as int[], nodes))
            }
        }
    }
}
