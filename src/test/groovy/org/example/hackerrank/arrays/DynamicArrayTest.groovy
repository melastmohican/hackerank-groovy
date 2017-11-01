package org.example.hackerrank.arrays

import org.example.hackerrank.HackerRankTest

class DynamicArrayTest extends HackerRankTest {

    def setup() {
        initStreams "2 5\n" +
                "1 0 5\n" +
                "1 1 7\n" +
                "1 0 3\n" +
                "2 1 0\n" +
                "2 1 1"
    }

    def "test execute"() {
        given:
        exec = new DynamicArray()

        when:
        exec.execute()

        then:
        checkResult "7\n" + "3"
    }
}
