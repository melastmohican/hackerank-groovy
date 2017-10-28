class ArraysDS {
    static def execute() {
        System.in.withReader { console ->
            def count = console.readLine()
            def a = console.readLine().split(' ')
            a.reverse().each {
                print it + " "
            }
        }
    }

    static void main(String[] args) {
        def input = "4\n1 4 3 2"
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is)
        execute()
    }
}
