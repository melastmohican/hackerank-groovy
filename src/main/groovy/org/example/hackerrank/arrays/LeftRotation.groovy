package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankExecutable

/**
 * A left rotation operation on an array of size  shifts each of the array's elements 1 unit to the left. For example, if 2 left rotations are performed on array [1,2,3,4,5],
 * then the array would become [3,4,5,1,2].
 *
 * Given an array of n integers and a number, d, perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.
 *
 * Input Format
 *
 * The first line contains two space-separated integers denoting the respective values of n (the number of integers) and d (the number of left rotations you must perform).
 * The second line contains n space-separated integers describing the respective elements of the array's initial state.
 *
 * Constraints
 *
 * 1 <= n <= 10^5
 * 1 <= d <= n
 * 1 <= ai <= 10^6
 *
 * Output Format
 *
 * Print a single line of n space-separated integers denoting the final state of the array after performing d left rotations.
 */
class LeftRotation implements HackerRankExecutable {
    @Override
    def execute() {
        def p
        def a
        System.in.withReader { console ->
            p = console.readLine().split(' ').collect { it.toInteger() } as int[]
            a = console.readLine().split(' ').collect { it.toInteger() } as int[]
        }
        def n = p[0]
        def d = p[1]
        def q = new LinkedList()
        q.addAll(a)
        (0..d-1).each {
            def tmp = q.poll()
            q << tmp
        }
        println q.join(' ')
    }
}
