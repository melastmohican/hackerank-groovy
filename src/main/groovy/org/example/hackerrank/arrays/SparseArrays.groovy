package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankExecutable

/**
 * There is a collection of N strings ( There can be multiple occurences of a particular string ). Each string's length is no more than 20 characters. There are also Q queries.
 * For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of N strings.

 Input Format

 The first line contains N, the number of strings.
 The next N lines each contain a string.
 The N+2 line contains Q, the number of queries.
 The following Q lines each contain a query string.

 Constraints

    1 <= N <= 1000
    1 <= Q <= 1000
    1 <= length of any string <= 20

 Sample Input

 4
 aba
 baba
 aba
 xzxb
 3
 aba
 xzxb
 ab
 Sample Output

 2
 1
 0
 */
class SparseArrays implements HackerRankExecutable {
    @Override
    def execute() {
        def strings = []
        def queries = []
        System.in.withReader { console ->
            def n = console.readLine() as int
            (0..n-1).each {
                strings << console.readLine()
            }
            def q = console.readLine() as int
            (0..q-1).each {
                queries << console.readLine()
            }
        }
        def results = queries.collect { qry ->
            int count = strings.findAll { qry == it }.size()
        }
        results.each {
            println it
        }
    }
}
