package org.example.hackerrank.trees

import spock.lang.Specification

class CheckBSTTest extends Specification {
    def "test checkBST(NULL)"() {
        given:
        Node root = null
        CheckBST ex = new CheckBST()

        when:
        boolean result = ex.checkBST(root)
        then:
        assert result == true
    }

    /**
     *          3
            5     2
          1   4 6
     */
    def "test checkBST(R3->L5R2->L1R4L6)"() {
        given:
        def a = []
        (2**3).times { a += -1 }

        a[0] = 3
        int l1 = Node.left(a, 0, 5)
        int r1 = Node.right(a, 0, 2)

        int l2 = Node.left(a, l1, 1)
        int r2 = Node.right(a, l1, 4)
        int l3 = Node.left(a, r1, 6)

        Node root = Node.fromArray(a as int[])
        CheckBST ex = new CheckBST()

        when:
        boolean result = ex.checkBST(root)
        then:
        assert result == false
    }

    def "test checkBST([1,2,3,4,7])"() {
        given:
        int[] a = [1,2,3,4,7]
        Node root = Node.fromArrayToBST(a)
        CheckBST ex = new CheckBST()

        when:
        boolean result = ex.checkBST(root)
        then:
        assert result == true
    }
}