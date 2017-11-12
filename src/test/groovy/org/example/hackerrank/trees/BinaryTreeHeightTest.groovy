package org.example.hackerrank.trees

import spock.lang.Specification

class BinaryTreeHeightTest extends Specification {
    def "test height(NULL)"() {
        given:
        Node root = null
        BinaryTreeHeight ex = new BinaryTreeHeight()

        when:
        int result = ex.height(root)
        then:
        assert -1 == result
    }

    /**
     * {@code
     *      3
        2      5
     1      4       6
                        7
     }
     */
    def "test height(3->L2R5->L1R4R6->R6)"() {
        given:
        def a = []
        (2**4).times { a += -1 }

        a[0] = 3
        int l1 = Node.left(a, 0, 2)
        int r1 = Node.right(a, 0, 5)

        int l2 = Node.left(a, l1, 1)
        int r2 = Node.right(a, l1, 4)
        int r3 = Node.right(a, r1, 6)

        int r4 = Node.right(a, r3, 7)

        Node root = Node.fromArray(a as int[])
        BinaryTreeHeight ex = new BinaryTreeHeight()

        when:
        int result  = ex.height(root)
        then:
        assert 3 == result
    }
}
