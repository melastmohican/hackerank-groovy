import spock.lang.Specification

class ArraysDSTest extends Specification {
    def "test execute"() {
        setup:
        def input = "4\n1 4 3 2"
        InputStream is = new ByteArrayInputStream(input.getBytes())
        System.setIn(is)
        ByteArrayOutputStream out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
        def app = new ArraysDS()

        when:
        app.execute()

        then:
        def result = out.toString().trim()
        result == "2 3 4 1"
    }
}
