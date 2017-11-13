package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankTest

class HuffmanDecodingTest extends HackerRankTest {
    def setup() {
        initOut()
    }

    /**
     *          {ϕ,5}
            0 /     \ 1
            {ϕ,2}   {A,3}
        0/   \1
     {B,1}  {C,1}

     S="1001011"
     */
    def "test decode"() {
        given:
        HuffmanDecoding.Node root = new HuffmanDecoding.Node()
        root.frequency = 5
        root.data = '\0'
        HuffmanDecoding.Node l1 = new HuffmanDecoding.Node()
        l1.frequency = 2
        l1.data = '\0'
        root.left = l1
        HuffmanDecoding.Node r1 = new HuffmanDecoding.Node()
        r1.frequency = 3
        r1.data = 'A'
        root.right = r1
        HuffmanDecoding.Node l2 = new HuffmanDecoding.Node()
        l2.frequency = 1
        l2.data = 'B'
        l1.left = l2
        HuffmanDecoding.Node r2 = new HuffmanDecoding.Node()
        r2.frequency = 1
        r2.data = 'C'
        l1.right = r2


        HuffmanDecoding ex = new HuffmanDecoding()

        when:
        ex.decode("1001011", root)
        then:
        checkResult "ABACA"
    }
}
