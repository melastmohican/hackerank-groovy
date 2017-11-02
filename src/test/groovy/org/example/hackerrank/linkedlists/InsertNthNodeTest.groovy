package org.example.hackerrank.linkedlists

import org.example.hackerrank.HackerRankTest

class InsertNthNodeTest extends HackerRankTest {
    def "test insertNth(NULL,1,0)"() {
        given:
        Node head = null
        InsertNthNode inn = new InsertNthNode()

        when:
        head = inn.insertNth(head, 1, 0)
        then:
        assert [1] == Node.toArray(head)
    }

    def "test insertNth(NULL,1,5)"() {
        given:
        Node head = null
        InsertNthNode inn = new InsertNthNode()

        when:
        head = inn.insertNth(head, 1, 5)
        then:
        assert [] == Node.toArray(head)
    }

    def "test insertNth([1,2,3,4,5],3,3)"() {
        given:
        def a = [1, 2, 3, 4, 5] as int[]
        Node head = Node.fromArray(a)
        InsertNthNode inn = new InsertNthNode()

        when:
        head = inn.insertNth(head, 8, 3)
        then:
        assert [1, 2, 3, 8, 4, 5] == Node.toArray(head)
    }
}
