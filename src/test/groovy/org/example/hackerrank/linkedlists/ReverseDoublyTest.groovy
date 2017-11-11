package org.example.hackerrank.linkedlists

import spock.lang.Specification

class ReverseDoublyTest extends Specification {
    def "test reverse(NULL)"() {
        given:
        ReverseDoubly.Node head = null
        ReverseDoubly rd = new ReverseDoubly()

        when:
        head = rd.reverse(head)
        then:
        assert [] == ReverseDoubly.Node.toArray(head)

    }

    def "test reverse([2,4,6])"() {
        given:
        ReverseDoubly.Node head = ReverseDoubly.Node.fromArray([2,4,6] as int[])
        ReverseDoubly rd = new ReverseDoubly()

        when:
        head = rd.reverse(head)
        then:
        assert [6,4,2] == ReverseDoubly.Node.toArray(head)

    }
}
