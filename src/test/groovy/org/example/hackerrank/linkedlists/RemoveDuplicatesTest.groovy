package org.example.hackerrank.linkedlists

import spock.lang.Specification

class RemoveDuplicatesTest extends Specification {
    def "test removeDuplicates(NULL)"() {
        given:
        Node head = null
        RemoveDuplicates rd = new RemoveDuplicates()

        when:
        head = rd.removeDuplicates(head)
        then:
        assert [] == Node.toArray(head)
    }

    def "test removeDuplicates([1,1,3,3,5,6])"() {
        given:
        Node head = Node.fromArray([1,1,3,3,5,6] as int[])
        RemoveDuplicates rd = new RemoveDuplicates()

        when:
        head = rd.removeDuplicates(head)
        then:
        assert [1,3,5,6] == Node.toArray(head)
    }

    def "test removeDuplicates([1,1,1,1,1,1,1])"() {
        given:
        Node head = Node.fromArray([1,1,1,1,1,1,1] as int[])
        RemoveDuplicates rd = new RemoveDuplicates()

        when:
        head = rd.removeDuplicates(head)
        then:
        assert [1] == Node.toArray(head)
    }
}
