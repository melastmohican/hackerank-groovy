import spock.lang.Specification

/**
 * Created by mordor on 10/28/17.
 */
class DynamicArrayTest extends Specification {
    def "test execute"() {
        given:
        def input = "2 5\n" +
                "1 0 5\n" +
                "1 1 7\n" +
                "1 0 3\n" +
                "2 1 0\n" +
                "2 1 1"
        InputStream is = new ByteArrayInputStream(input.getBytes())
        System.setIn(is)
        ByteArrayOutputStream out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
        def app = new DynamicArray()


        when:
        app.execute()

        then:
        def result = out.toString().trim()
        result == "7\n" + "3"
    }
}
