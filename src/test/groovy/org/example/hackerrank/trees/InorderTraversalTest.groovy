package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankTest

class InorderTraversalTest extends HackerRankTest {
    def setup() {
        initOut()
    }

    def "test inOrder(NULL)"() {
        given:
        Node root = null
        InorderTraversal pot = new InorderTraversal()

        when:
        pot.inOrder(root)
        then:
        checkResult ""
    }

    def "test inOrder(R1->R2->R5->L3R6->R4)"() {
        given:
        def a = []
        (2**5).times { a += -1 }

        a[0] = 1
        int p0 = Node.right(a, 0, 2)
        int p1 = Node.right(a, p0, 5)
        Node.right(a, p1, 6)
        int p2 = Node.left(a, p1, 3)
        Node.right(a, p2, 4)
        Node root = Node.fromArray(a as int[])
        InorderTraversal pot = new InorderTraversal()

        when:
        pot.inOrder(root)
        then:
        checkResult "1 2 3 4 5 6"
    }

}
