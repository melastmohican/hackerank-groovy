package org.example.hackerrank.linkedlists

import spock.lang.Specification

class CycleDetectionTest extends Specification {
    def "test hasCycle(NULL)"() {
        given:
        Node head = null
        CycleDetection cd = new CycleDetection()

        when:
        int result = cd.hasCycle(head)
        then:
        assert 0 == result
    }

    def "test hasCycle([1])"() {
        given:
        Node head = Node.fromArray([1] as int[])
        CycleDetection cd = new CycleDetection()

        when:
        int result = cd.hasCycle(head)
        then:
        assert 0 == result
    }

    def "test hasCycle([1,2,3->2])"() {
        given:
        Node head = Node.fromArray([1,2,3] as int[])
        Node n2 = Node.getAt(head,1)
        Node n3 = Node.getAt(head,2)
        n3.next = n2
        CycleDetection cd = new CycleDetection()

        when:
        int result = cd.hasCycle(head)
        then:
        assert 1 == result
    }
}
