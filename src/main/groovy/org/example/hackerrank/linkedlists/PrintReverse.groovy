package org.example.hackerrank.linkedlists

class PrintReverse {
    def reversePrint(Node head) {
        if (!head) {
            return
        }
        reversePrint(head.next)
        println head.data

    }
}
