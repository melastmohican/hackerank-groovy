package org.example.hackerrank.linkedlists

import org.example.hackerrank.HackerRankTest

class InsertTailNodeTest extends HackerRankTest {
    def "test insert(NULL)"() {
        given:
        Node head = null
        InsertTailNode itn = new InsertTailNode()

        when:
        head = itn.insert(head, 2)
        head = itn.insert(head, 3)
        then:
        assert [2,3] == Node.toArray(head)
    }
}
