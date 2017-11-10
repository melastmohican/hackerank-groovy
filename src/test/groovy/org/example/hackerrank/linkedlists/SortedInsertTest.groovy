package org.example.hackerrank.linkedlists

import spock.lang.Specification


class SortedInsertTest extends Specification {
    def "test sortedInsert(NULL,1)"() {
        given:
        SortedInsert.Node head = null
        SortedInsert si = new SortedInsert()

        when:
        head = si.sortedInsert(head, 1)
        then:
        assert [1] == SortedInsert.Node.toArray(head)
    }

    def "test sortedInsert([2],5)"() {
        given:
        SortedInsert.Node head = SortedInsert.Node.fromArray([2] as int[])
        SortedInsert si = new SortedInsert()

        when:
        head = si.sortedInsert(head, 5)
        then:
        assert [2, 5] == SortedInsert.Node.toArray(head)
    }

    def "test sortedInsert([2,5],4)"() {
        given:
        SortedInsert.Node head = SortedInsert.Node.fromArray([2, 5] as int[])
        SortedInsert si = new SortedInsert()

        when:
        head = si.sortedInsert(head, 4)
        then:
        assert [2, 4, 5] == SortedInsert.Node.toArray(head)
    }
}
