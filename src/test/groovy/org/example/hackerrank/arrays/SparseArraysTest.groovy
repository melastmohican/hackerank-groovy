package org.example.hackerrank.arrays

import org.example.hackerrank.HackerRankTest

class SparseArraysTest extends HackerRankTest {
    def setup() {
        initStreams "4\n" +
                "aba\n" +
                "baba\n" +
                "aba\n" +
                "xzxb\n" +
                "3\n" +
                "aba\n" +
                "xzxb\n" +
                "ab"
    }

    def "test execute"() {
        given:
        exec = new SparseArrays()

        when:
        exec.execute()

        then:
        checkResult "2\n" +
                "1\n" +
                "0"
    }
}
