package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankExecutable

class ArraysDS implements HackerRankExecutable {
    def execute() {
        System.in.withReader { console ->
            def count = console.readLine()
            def a = console.readLine().split(' ')
            a.reverse().each {
                print it + " "
            }
        }
    }
}
