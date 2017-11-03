package org.example.hackerrank.linkedlists

import spock.lang.Specification

class GetNthNodeFromTailTest extends Specification {
    def "test getNode(NULL,1)"() {
        given:
        Node head = null
        GetNthNodeFromTail gn = new GetNthNodeFromTail()

        when:
        int result = gn.getNode(head,1)
        then:
        assert -1 == result
    }

    def "test getNode([1,3,5,6],0)"() {
        given:
        Node head = Node.fromArray([1,3,5,6] as int[])
        GetNthNodeFromTail gn = new GetNthNodeFromTail()

        when:
        int result = gn.getNode(head,0)
        then:
        assert 6 == result
    }

    def "test getNode([1,3,5,6],2)"() {
        given:
        Node head = Node.fromArray([1,3,5,6] as int[])
        GetNthNodeFromTail gn = new GetNthNodeFromTail()

        when:
        int result = gn.getNode(head,2)
        then:
        assert 3 == result
    }

    def "test getNode([1,3,5,6],4)"() {
        given:
        Node head = Node.fromArray([1,3,5,6] as int[])
        GetNthNodeFromTail gn = new GetNthNodeFromTail()

        when:
        int result = gn.getNode(head,4)
        then:
        assert -1 == result
    }

    def "test getNode([1,3,5,6],5)"() {
        given:
        Node head = Node.fromArray([1,3,5,6] as int[])
        GetNthNodeFromTail gn = new GetNthNodeFromTail()

        when:
        int result = gn.getNode(head,5)
        then:
        assert -1 == result
    }
}
