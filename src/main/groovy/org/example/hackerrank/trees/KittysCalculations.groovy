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
    static final int maxn = 5 * 1e5 + 5

    def createAdjSet = { new HashSet<Integer>() }
    Set<Integer>[] adj = ([createAdjSet] * maxn)*.call()
    int[][] LCA = new int[maxn][22]
    int[] vis = new int[maxn]
    int[] sz = new int[maxn]
    int[] L = new int[maxn]
    int[] inp = new int[maxn]
    int[] out = new int[maxn]
    boolean[] check = new boolean[maxn]

    def createTupleList = { new LinkedList<Tuple2<Integer, Integer>>() }
    List<Tuple2<Integer, Integer>>[] g = ([createTupleList] * maxn)*.call()

    long[][] dp = new long[2][maxn]
    long[] lev = new long[maxn]

    int lg

    def log2(n) { Math.log(n) / Math.log(2) }


    def dfs() {
        Queue<Integer> Q = [] as Queue
        Q << 1
        vis[1] = 1;
        Stack<Integer> S = [] as Set
        while (Q) {
            int u = Q.poll()
            sz[u] = 1
            S.push(u)
            for (Integer it : adj[u]) {
                if (!vis[it]) {
                    vis[it] = 1
                    L[it] = L[u] + 1
                    LCA[it][0] = u
                    Q << it
                }
            }
        }

        while (S) {
            int u = S.pop()
            vis[u] = 0
            for (Integer it : adj[u]) {
                if (!vis[it])
                    sz[u] += sz[it]
            }
        }

        Q << 1
        inp[1] = 1
        vis[1] = 1
        while (Q) {
            int u = Q.poll()
            S << u
            int s = 0
            for (Integer it : adj[u]) {
                if (!vis[it]) {
                    vis[it] = 1
                    inp[it] = s + inp[u] + 1;
                    s += sz[it];
                    Q << it
                }
            }
        }

        while (S) {
            int u = S.pop()
            vis[u] = 0
            out[u] = inp[u]
            for (Integer it : adj[u]) {
                if (!vis[it]) {
                    out[u] = Math.max(out[u], out[it])
                }
            }
        }
    }

    def constructLCA(int n) {
        lg = Math.ceil(log2(n));
        dfs();
        for (int i = 1; i <= lg; i++) {
            for (int j = 1; j <= n; j++) {
                if (LCA[j][i - 1]) {
                    LCA[j][i] = LCA[LCA[j][i - 1]][i - 1]
                }
            }
        }
    }

    int getLca(int x, int y) {
        if (L[x] < L[y])
            (x, y) = [y, x]
        for (int i = lg; i >= 0; i--) {
            if (LCA[x][i] != 0 && L[LCA[x][i]] >= L[y])
                x = LCA[x][i];
        }
        if (x == y)
            return x
        for (int i = lg; i >= 0; i--) {
            if (LCA[x][i] != 0 && LCA[x][i] != LCA[y][i]) {
                x = LCA[x][i]
                y = LCA[y][i]
            }
        }
        return LCA[x][0]
    }

    boolean anc(int p, int u) {
        return inp[p] <= inp[u] && out[p] >= out[u];
    }

    def solve(int u) {
        long ans = 0
        Queue<Integer> Q = [] as Queue
        Q << u
        vis[u] = 1
        lev[u] = 0
        Stack<Integer> S = [] as Stack
        while (Q) {
            u = Q.poll()
            S << u
            for (Tuple2<Integer, Integer> it : g[u]) {
                if (!vis[it.first]) {
                    vis[it.first] = 1
                    lev[it.first] = lev[u] + it.second
                    Q << it.first
                }
            }
        }

        while (S) {
            u = S.pop()
            vis[u] = 0
            dp[0][u] = check[u] ? u : 0;
            dp[1][u] = check[u] ? 1L * lev[u] * u : 0
            dp[1][u] %= MOD_VALUE
            long s = 0
            for (Tuple2<Integer, Integer> it : g[u]) {
                if (!vis[it.first]) {
                    s += dp[0][it.first];
                    if (s >= MOD_VALUE) s -= MOD_VALUE;
                    dp[0][u] += dp[0][it.first]
                    if (dp[0][u] >= MOD_VALUE) dp[0][u] -= MOD_VALUE
                    dp[1][u] += dp[1][it.first]
                    if (dp[1][u] >= MOD_VALUE) dp[1][u] -= MOD_VALUE;
                }
            }
            // ok
            for (Tuple2<Integer, Integer> it : g[u]) {
                if (!vis[it.first]) {
                    ans += 1L * (dp[1][it.first] - 1L * dp[0][it.first] * lev[u] % MOD_VALUE) * (s - dp[0][it.first]) % MOD_VALUE
                    if (ans >= MOD_VALUE) ans -= MOD_VALUE
                    if (ans < 0) ans += MOD_VALUE;
                }
            }
            if (check[u]) ans += 1L * (dp[1][u] - 1L * lev[u] * dp[0][u] % MOD_VALUE) * u % MOD_VALUE;
            if (ans >= MOD_VALUE) ans -= MOD_VALUE;
            if (ans < 0) ans += MOD_VALUE
        }
        ans
    }

    @Override
    def execute() {
        new Scanner(System.in).withCloseable { sc ->
            int n = sc.nextInt();
            int q = sc.nextInt();
            for (int i = 1; i <= n - 1; i++) {
                int u = sc.nextInt()
                int v = sc.nextInt()
                adj[u] << v
                adj[v] << u
            }
            constructLCA(n)

            int cnt = 0;
            while (q--) {
                int k = sc.nextInt()
                List<Tuple2<Integer, Integer>> Q = [] as Queue
                Set<Integer> K = [] as Set
                for (int i = 1; i <= k; i++) {
                    int x = sc.nextInt()
                    check[x] = true
                    if (!K.find { it == x }) {
                        K << x
                        Q << new Tuple2<Integer, Integer>(inp[x], x)
                    }
                }
                k = Q.size();
                Q.sort(new OrderBy([{ it.first }, { it.second }]))
                for (int i = 0; i <= k - 2; i++) {
                    int lca = getLca(Q[i].second, Q[i + 1].second)
                    if (!K.find { it == lca }) {
                        K << lca
                        Q << new Tuple2<Integer, Integer>(inp[lca], lca)
                    }
                }
                Q.sort(new OrderBy([{ it.first }, { it.second }]))
                Stack<Integer> s = [] as Stack
                s << Q[0].second
                for (int i = 1; i < Q.size(); i++) {
                    while (!anc(s.peek(), Q[i].second)) {
                        s.pop()
                    }
                    def t1 = [Q[i].second, L[Q[i].second] - L[s.peek()]] as Tuple2
                    g[s.peek()] << t1
                    def t2 = [s.peek(), L[Q[i].second] - L[s.peek()]] as Tuple2
                    g[Q[i].second] << t2
                    s << Q[i].second
                }
                long ans = solve(Q[0].second)
                println ans
                for (Tuple2<Integer, Integer> it : Q) {
                    g[it.second].clear()
                    dp[0][it.second] = dp[1][it.second] = lev[it.second] = 0
                    check[it.second] = false
                }

            }

        }
    }
}
