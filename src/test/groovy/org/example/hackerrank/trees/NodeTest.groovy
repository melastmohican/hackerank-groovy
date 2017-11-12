package org.example.hackerrank.trees

import spock.lang.Specification

class NodeTest extends Specification {
    def "test fromArray(1,2,3,4,5,6,7])"() {
        given:
        int[] a = [1,2,3,4,5,6,7]

        when:
        Node root = Node.fromArray(a)
        then:
        assert [1,2,3,4,5,6,7] == Node.toArray(root)
    }
}
