package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankTest
import spock.lang.Ignore

class KittysCalculationsTest extends HackerRankTest {
    @Ignore
    def "test execute"() {
        given:
        initStreams "7 3\n" +
                "1 2\n" +
                "1 3\n" +
                "1 4\n" +
                "3 5\n" +
                "3 6\n" +
                "3 7\n" +
                "2\n" +
                "2 4\n" +
                "1\n" +
                "5\n" +
                "3\n" +
                "2 4 5"
        exec = new KittysCalculations()

        when:
        exec.execute()
        then:
        checkResult "16\n" +
                "0\n" +
                "106"
    }

    @Ignore
    def "test execute-input01"() {
        given:
        initFileStreams "kittyscalculations/input01.txt"
        exec = new KittysCalculations()

        when:
        exec.execute()
        then:
        checkFileResult "kittyscalculations/output01.txt"
    }

    @Ignore
    def "test execute-input02"() {
        given:
        initFileStreams "kittyscalculations/input02.txt"
        exec = new KittysCalculations()

        when:
        exec.execute()
        then:
        checkFileResult "kittyscalculations/output02.txt"
    }

    @Ignore
    def "test execute-input03"() {
        given:
        initFileStreams "kittyscalculations/input03.txt"
        exec = new KittysCalculations()

        when:
        exec.execute()
        then:
        checkFileResult "kittyscalculations/output03.txt"
    }
}
