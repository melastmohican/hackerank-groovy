package org.example.hackerrank.arrays

import org.example.hackerrank.HackerRankTest

class ArrayManipulationTest extends HackerRankTest {

    def setup() {
        initStreams "5 3\n" +
                "1 2 100\n" +
                "2 5 100\n" +
                "3 4 100"
    }

    def "test execute"() {
        given:
        exec = new ArrayManipulation()

        when:
        exec.execute()

        then:
        checkResult "200"
    }
}
