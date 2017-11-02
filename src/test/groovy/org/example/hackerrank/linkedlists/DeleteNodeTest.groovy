package org.example.hackerrank.linkedlists

import spock.lang.Specification

class DeleteNodeTest extends Specification {
    def "test delete(NULL,0)"() {
        given:
        Node head = null
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 0)
        then:
        assert [] == Node.toArray(head)
    }

    def "test delete([1,2,3],0)"() {
        given:
        def a = [1, 2, 3] as int[]
        Node head = Node.fromArray(a)
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 0)
        then:
        assert [2, 3] == Node.toArray(head)
    }

    def "test delete([1,2,3],1)"() {
        given:
        def a = [1, 2, 3] as int[]
        Node head = Node.fromArray(a)
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 1)
        then:
        assert [1, 3] == Node.toArray(head)
    }

    def "test delete([1,2,3],2)"() {
        given:
        def a = [1, 2, 3] as int[]
        Node head = Node.fromArray(a)
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 2)
        then:
        assert [1, 2] == Node.toArray(head)
    }

    def "test delete([1],0)"() {
        given:
        def a = [1] as int[]
        Node head = Node.fromArray(a)
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 0)
        then:
        assert [] == Node.toArray(head)
    }

    def "test delete([1,2,3,4,5],3)"() {
        given:
        def a = [1, 2, 3, 4, 5] as int[]
        Node head = Node.fromArray(a)
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 3)
        then:
        assert [1, 2, 3, 5] == Node.toArray(head)
    }

    def "test delete([4 3 2 5 1],2)"() {
        given:
        def a = [4, 3, 2, 5, 1] as int[]
        Node head = Node.fromArray(a)
        DeleteNode dn = new DeleteNode()

        when:
        head = dn.delete(head, 2)
        then:
        assert [4,3,5,1] == Node.toArray(head)
    }
}
