package org.example.hackerrank.trees

import org.example.hackerrank.HackerRankTest

class KittysCalculationsTest extends HackerRankTest {
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
}
