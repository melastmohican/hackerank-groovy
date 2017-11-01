package org.example.hackerrank.linkedlists

import org.example.hackerrank.HackerRankTest

class InsertHeadNodeTest extends HackerRankTest {
    def "test insert"() {
        given:
        Node head = null
        InsertHeadNode ihn = new InsertHeadNode()

        when:
        head = ihn.insert(head, 1)
        head = ihn.insert(head, 2)

        then:
        assert [2,1] == Node.toArray(head)
    }
}
