package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankExecutable

/**
 * You are given a list(1-indexed) of size n, initialized with zeroes. You have to perform m operations on the list and output the maximum of final values of all the n elements in the list.
 * For every operation, you are given three integers a, b and k and you have to add value k to all the elements ranging from index a to b (both inclusive).

 For example, consider a list a of size 3. The initial list would be  = [0, 0, 0] and after performing the update O(a, b, k) =  (2,3,30) the new list would be a = [0, 30, 30].
 Here, we've added value 30 to elements between indices 2 and 3. Note the index of the list starts from 1.

 Input Format

 The first line will contain two integers n and m separated by a single space.
 Next  lines will contain three integers a, b and k separated by a single space.
 Numbers in list are numbered 1 from to n.

 Constraints
    3 <= n <= 10
    1 <= m <= 2 * 10^5
    1 <= b <= b <= n
    0 <= k <= 10^9

 Output Format

 Print in a single line the maximum value in the updated list.
 */
class ArrayManipulation implements HackerRankExecutable {
    @Override
    def execute() {
        def n = 3
        def m = 1
        def ops  = []
        System.in.withReader { console ->
            def p = console.readLine().split(' ').collect { it.toInteger() } as int[]
            n = p[0]
            m = p[1]
            (1..m).each {
                def row = console.readLine().split(' ').collect { it.toInteger() } as int[]
                ops << row
            }
        }
        def arr = new int[n]
        ops.each {
            def (a,b,k) = it
            (a..b).each {
                arr[it-1] += k
            }
        }
        def result = arr.toList().max()
        println result
    }
}
