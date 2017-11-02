package org.example.hackerrank.linkedlists

import spock.lang.Specification

class ReverseTest extends Specification {
    def "test reverse(NULL)"() {
        given:
        Node head = null
        Reverse r = new Reverse()

        when:
        head = r.reverse(head)
        then:
        assert [] == Node.toArray(head)
    }

    def "test reverse([2,3])"() {
        given:
        def a = [2, 3] as int[]
        Node head = Node.fromArray(a)
        Reverse r = new Reverse()

        when:
        head = r.reverse(head)
        then:
        assert [3,2] == Node.toArray(head)
    }
}
