import spock.lang.Specification

class Array2DDSTest extends Specification {
    def "test execute"() {
        given:
        def input = "1 1 1 0 0 0\n" +
                "0 1 0 0 0 0\n" +
                "1 1 1 0 0 0\n" +
                "0 0 2 4 4 0\n" +
                "0 0 0 2 0 0\n" +
                "0 0 1 2 4 0"
        InputStream is = new ByteArrayInputStream(input.getBytes())
        System.setIn(is)
        ByteArrayOutputStream out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
        def app = new Array2DDS()

        when:
        app.execute()
        then:
        def result = out.toString().trim()
        result == "19"
    }
}
