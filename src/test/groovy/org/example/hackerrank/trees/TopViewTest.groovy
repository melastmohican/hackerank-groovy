package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankTest

class TopViewTest extends HackerRankTest {

    def setup() {
        initOut()
    }

    def "test topView(NULL)"() {
        given:
        Node root = null
        TopView ex = new TopView()

        when:
        ex.topView(root)
        then:
        checkResult ""
    }

    /**
     *{@code
     *      1
                2
                    5
                3       6
                    4
     }
     */
    def "test topView(R1->R2->R5->L3R6->R4)"() {
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
        TopView ex = new TopView()

        when:
        ex.topView(root)
        then:
        checkResult "1 2 5 6"
    }
}
