package org.example.hackerrank.arrays

import org.example.hackerrank.HackerRankTest

class LeftRotationTest extends HackerRankTest {

    def setup() {
        initStreams "5 4\n" +
                "1 2 3 4 5"
    }

    def "test execute"() {
        given:
        exec = new LeftRotation()

        when:
        exec.execute()

        then:
        checkResult "5 1 2 3 4"
    }
}
