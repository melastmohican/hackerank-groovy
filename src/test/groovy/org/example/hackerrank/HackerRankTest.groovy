package org.example.hackerrank

import org.example.hackerrank.HackerRankExecutable
import spock.lang.Specification


abstract class HackerRankTest extends Specification {
    def InputStream is
    def ByteArrayOutputStream out
    def HackerRankExecutable exec

    public initStreams(String input) {
        is = new ByteArrayInputStream(input.getBytes())
        System.setIn(is)
        out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
    }

    public initOut() {
        out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
    }

    public boolean checkResult(String expected) {
        def result = out.toString().trim()
        result == expected
    }
}
