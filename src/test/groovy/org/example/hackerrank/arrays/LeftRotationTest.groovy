package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankTest
import spock.lang.Specification

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
