package org.example.hackerrank.linkedlists

import org.example.hackerrank.HackerRankTest

class PrintReverseTest extends HackerRankTest {
    def setup() {
        initOut()
    }

    def "test reversePrint(NULL)"() {
        given:
        Node head = null
        PrintReverse pr = new PrintReverse()

        when:
        pr.reversePrint(head)
        then:
        checkResult ""
    }

    def "test reversePrint([1,2])"() {
        given:
        def a = [1,2] as int[]
        Node head = Node.fromArray(a)
        PrintReverse pr = new PrintReverse()

        when:
        pr.reversePrint(head)
        then:
        checkResult "2\n" +
                "1"
    }

    def "test reversePrint([2,1,4,5])"() {
        given:
        def a = [2,1,4,5] as int[]
        Node head = Node.fromArray(a)
        PrintReverse pr = new PrintReverse()

        when:
        pr.reversePrint(head)
        then:
        checkResult "5\n" +
                "4\n" +
                "1\n" +
                "2"
    }
}
