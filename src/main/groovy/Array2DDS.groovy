/**
 * Given a 6 x 6 2D Array, A:

 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0

 We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:

 a b c
 d
 e f g
 There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.

 Task
 Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.

 Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.

 Input Format

 There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .

 Constraints

 Output Format

 Print the largest (maximum) hourglass sum found in .
 */
class Array2DDS {
    static def execute() {
        def input = [] as int[][]
        System.in.withReader { console ->
            def line = console.readLine()
            while (line != null) {
                def row = line.split(' ').collect { it.toInteger() }
                input += row as int[]
                line = console.readLine()
            }
        }
        def max = Integer.MIN_VALUE
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                def a = input[x][y]
                def b = input[x][y + 1]
                def c = input[x][y + 2]
                def d = input[x + 1][y + 1]
                def e = input[x + 2][y]
                def f = input[x + 2][y + 1]
                def g = input[x + 2][y + 2]
                def s = a + b + c + d + e + f + g
                if (s > max) {
                    max = s
                }
            }
        }
        println max as int
    }

}
