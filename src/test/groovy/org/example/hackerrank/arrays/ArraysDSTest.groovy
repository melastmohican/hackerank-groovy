package org.example.hackerrank.arrays

import org.example.hackerank.HackerRankTest
import spock.lang.Specification

class ArraysDSTest extends HackerRankTest {

    def setup() {
        initStreams "4\n1 4 3 2"
    }
    def "test execute"() {
        setup:
        exec = new ArraysDS()

        when:
        exec.execute()

        then:
        checkResult"2 3 4 1"
    }
}
