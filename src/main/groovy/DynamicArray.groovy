/**
 * Create a list, seqList , of N empty sequences, where each sequence is indexed from 0 to N-1. The elements within each of the N  sequences also use 0-indexing.
 Create an integer, lastAnswer, and initialize it to 0.
 The 2 types of queries that can be performed on your list of sequences (seqList) are described below:
 Query: 1 x y
 Find the sequence, seq, at index ((x XOR lastAnswer) % N) in seqList.
 Append integer y to sequence seq.
 Query: 2 x y
 Find the sequence, seq, at index ((x XOR lastAnswer) % N) in seqList.
 Find the value of element y % size in seq (where size is the size of seq) and assign it to LastAnswer.
 Print the new value of lastNswer on a new line

 Task
 Given N, Q, and Q queries, execute each query.

 Note: XOR is the bitwise XOR operation, which corresponds to the ^ operator in most languages.

 Input Format

 The first line contains two space-separated integers, N (the number of sequences) and Q (the number of queries), respectively.
 Each of the Q subsequent lines contains a query in the format defined above.

 Constraints
 1 <- N,Q <- 10^5
 0 <= x <= 1-^9
 0 <= y <= 10^9

 It is guaranteed that query type 2 will never query an empty sequence or index.
 */
class DynamicArray {
    static def execute() {
        int n
        int q
        int lastAnswer = 0
        def seqList = []
        def queries = []
        System.in.withReader { console ->
            def params = console.readLine().split(' ')
            n = params[0] as int
            q = params[1] as int
            (0..(n - 1)).each {
                seqList << []
            }
            (0..(q - 1)).each {
                def qry = console.readLine().split(' ').collect { it.toInteger() }
                queries << (qry as int[])
            }
        }
        queries.each { qry ->
            def type = qry[0]
            def x = qry[1]
            def y = qry[2]
            def seq = seqList[(x ^ lastAnswer) % n]
            if (type == 1) {
                seq << y
            } else {
                lastAnswer = seq[y % seq.size()]
                println lastAnswer
            }
        }
    }
}
