package org.example.hackerrank.linkedlists

import org.example.hackerrank.HackerRankTest

class PrintElementsTest extends HackerRankTest {
    def setup() {
        initOut()
    }

    def "test print(NULL)"() {
        given:
        Node node = null
        PrintElements pe = new PrintElements()

        when:
        pe.print(node)

        then:
        checkResult ""
    }

    def "test print(1,2,3)"() {
        given:
        def a = [1,2,3] as int[]
        Node node = Node.fromArray(a)
        PrintElements pe = new PrintElements()

        when:
        pe.print(node)

        then:
        checkResult "1\n" +
                "2\n" +
                "3"
    }
}
