package org.example.hackerrank.linkedlists

import spock.lang.Specification


class FindMergePointTest extends Specification {
    def "test findMergeNode([1,2,3],NULL)"() {
        given:
        Node headA = Node.fromArray([1, 2, 3] as int[])
        Node headB = null
        FindMergePoint fmp = new FindMergePoint()

        when:
        int result = fmp.findMergeNode(headA, headB)
        then:
        assert -1 == result
    }
    def "test findMergeNode([1,2,3],[1]) -> 2"() {
        given:
        Node headA = Node.fromArray([1, 2, 3] as int[])
        Node headB = Node.fromArray([1] as int[])
        Node n2 = Node.getAt(headA,1)
        Node n1 = Node.getAt(headB,0)
        n1.next = n2
        FindMergePoint fmp = new FindMergePoint()

        when:
        int result = fmp.findMergeNode(headA, headB)
        then:
        assert 2 == result
    }

    def "test findMergeNode([1,2,3],[1]) -> 3"() {
        given:
        Node headA = Node.fromArray([1, 2, 3] as int[])
        Node headB = Node.fromArray([1] as int[])
        Node n2 = Node.getAt(headA,2)
        Node n1 = Node.getAt(headB,0)
        n1.next = n2
        FindMergePoint fmp = new FindMergePoint()

        when:
        int result = fmp.findMergeNode(headA, headB)
        then:
        assert 3 == result
    }
}
