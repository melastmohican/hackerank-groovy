package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankTest
import spock.lang.Specification

class Array2DDSTest extends HackerRankTest {

    def setup() {
        initStreams "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 2 4 4 0\n" +
                "0 0 0 2 0 0\n" +
                "0 0 1 2 4 0"
    }

    def "test execute"() {
        given:
        exec = new Array2DDS()

        when:
        exec.execute()
        then:
        checkResult "19"
    }
}
