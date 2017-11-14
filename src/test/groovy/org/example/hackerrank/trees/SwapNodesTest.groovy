package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankTest
import spock.lang.Specification

class SwapNodesTest extends HackerRankTest {

    def "test execute #00"() {
        given:
        initStreams "3\n" +
                "2 3\n" +
                "-1 -1\n" +
                "-1 -1\n" +
                "2\n" +
                "1\n" +
                "1"
        exec = new SwapNodes()

        when:
        exec.execute()
        then:
        checkResult "3 1 2 \n" +
                "2 1 3"
    }

    def "test execute #01"() {
        given:
        initStreams "5\n" +
                "2 3\n" +
                "-1 4\n" +
                "-1 5\n" +
                "-1 -1\n" +
                "-1 -1\n" +
                "1\n" +
                "2"
        exec = new SwapNodes()

        when:
        exec.execute()
        then:
        checkResult "4 2 1 5 3"
    }

    def "test execute #02"() {
        given:
        initStreams "11\n" +
                "2 3\n" +
                "4 -1\n" +
                "5 -1\n" +
                "6 -1\n" +
                "7 8\n" +
                "-1 9\n" +
                "-1 -1\n" +
                "10 11\n" +
                "-1 -1\n" +
                "-1 -1\n" +
                "-1 -1\n" +
                "2\n" +
                "2\n" +
                "4"
        exec = new SwapNodes()

        when:
        exec.execute()
        then:
        checkResult "2 9 6 4 1 3 7 5 11 8 10 \n" +
                "2 6 9 4 1 3 7 5 10 8 11"
    }
}
