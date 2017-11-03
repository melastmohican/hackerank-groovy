package org.example.hackerrank.linkedlists

import spock.lang.Specification

class MergeSortedTest extends Specification {
    def "test mergeLists(NULL,NULL)"() {
        given:
        Node headA = null
        Node headB = null
        MergeSorted ms = new MergeSorted()

        when:
        Node head = ms.mergeLists(headA, headB)
        then:
        assert [] == Node.toArray(head)
    }

    def "test mergeLists(NULL,[1])"() {
        given:
        Node headA = null
        Node headB = Node.fromArray([1] as int[])
        MergeSorted ms = new MergeSorted()

        when:
        Node head = ms.mergeLists(headA, headB)
        then:
        assert [1] == Node.toArray(head)
    }

    def "test mergeLists([1], NULL)"() {
        given:
        Node headA = Node.fromArray([1] as int[])
        Node headB = null
        MergeSorted ms = new MergeSorted()

        when:
        Node head = ms.mergeLists(headA, headB)
        then:
        assert [1] == Node.toArray(head)
    }

    def "test mergeLists([1], [1])"() {
        given:
        Node headA = Node.fromArray([1] as int[])
        Node headB = Node.fromArray([1] as int[])
        MergeSorted ms = new MergeSorted()

        when:
        Node head = ms.mergeLists(headA, headB)
        then:
        assert [1, 1] == Node.toArray(head)
    }

    def "test mergeLists([15], [12])"() {
        given:
        Node headA = Node.fromArray([15] as int[])
        Node headB = Node.fromArray([12] as int[])
        MergeSorted ms = new MergeSorted()

        when:
        Node head = ms.mergeLists(headA, headB)
        then:
        assert [12, 15] == Node.toArray(head)
    }

    def "test mergeLists([1,3,5,6], [2,4,7])"() {
        given:
        Node headA = Node.fromArray([1, 3, 5, 6] as int[])
        Node headB = Node.fromArray([2, 4, 7] as int[])
        MergeSorted ms = new MergeSorted()

        when:
        Node head = ms.mergeLists(headA, headB)
        then:
        assert [1, 2, 3, 4, 5, 6, 7] == Node.toArray(head)
    }
}
