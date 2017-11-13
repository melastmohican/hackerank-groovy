package org.example.hackerrank.trees

import spock.lang.Specification

class LowestCommonAncestorTest extends Specification {
    def "test lca"() {
        given:
        int[] a = [4,2,7,1,3,6]
        Node root = Node.fromArray(a)
        LowestCommonAncestor ex = new LowestCommonAncestor()

        when:
        Node result = ex.lca(root, 1, 7)
        then:
        assert result == root
    }
}
