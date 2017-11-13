package org.example.hackerrank.trees

import spock.lang.Specification

class BinarySearchTreeInsertionTest extends Specification {
    def "test insert(NULL, 1)"() {
        given:
        Node root = null
        BinarySearchTreeInsertion ex = new BinarySearchTreeInsertion()

        when:
        root = ex.insert(root,1)
        then:
        assert [1] == Node.toArray(root)
    }

    def "test insert([2], 2)"() {
        given:
        Node root = new Node(2)
        BinarySearchTreeInsertion ex = new BinarySearchTreeInsertion()

        when:
        root = ex.insert(root,2)
        then:
        assert [2] == Node.toArray(root)
    }

    def "test insert([1,2,3,4,7], 6)"() {
        given:
        int[] a = [1,2,3,4,7]
        Node root = Node.fromArrayToBST(a)
        BinarySearchTreeInsertion ex = new BinarySearchTreeInsertion()

        when:
        root = ex.insert(root,6)
        then:
        assert [1,2,3,4,6,7] == Node.bstToSortedArray(root)
    }
}
