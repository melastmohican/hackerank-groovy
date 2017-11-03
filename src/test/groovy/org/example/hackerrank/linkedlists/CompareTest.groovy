package org.example.hackerrank.linkedlists

import spock.lang.Specification

class CompareTest extends Specification {
    def "test compareLists(NULL,NULL)"() {
        given:
        Node headA = null
        Node headB = null
        Compare cmp = new Compare()

        when:
        int result = cmp.compareLists(headA, headB)
        then:
        assert result == 1
    }

    def "test compareLists(NULL,[1])"() {
        given:
        Node headA = null
        Node headB = new Node(1)
        Compare cmp = new Compare()

        when:
        int result = cmp.compareLists(headA, headB)
        then:
        assert result == 0
    }

    def "test compareLists([1,2],[1,2])"() {
        given:
        def a = [1, 2] as int[]
        Node headA = Node.fromArray(a)
        def b = [1, 2] as int[]
        Node headB = Node.fromArray(b)
        Compare cmp = new Compare()

        when:
        int result = cmp.compareLists(headA, headB)
        then:
        assert result == 1
    }

    def "test compareLists([1,2],[1,2,3])"() {
        given:
        def a = [1, 2] as int[]
        Node headA = Node.fromArray(a)
        def b = [1, 2,3] as int[]
        Node headB = Node.fromArray(b)
        Compare cmp = new Compare()

        when:
        int result = cmp.compareLists(headA, headB)
        then:
        assert result == 0
    }
}
