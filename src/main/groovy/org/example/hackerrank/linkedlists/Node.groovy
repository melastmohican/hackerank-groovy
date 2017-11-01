package org.example.hackerrank.linkedlists


class Node {
    int data;
    Node next;

    static def fromArray(int[] a) {
        Node head = new Node()
        Node node = head
        int idx = 0
        while (node) {
            node.data = a[idx++]
            node.next = idx < a.length ? new Node() : null
            node = node.next
        }
        head
    }

    static def toArray(Node head) {
        def result = []
        Node node = head
        while (node.next) {
            result += node.data
            node = node.next
        }
        result += node.data
        result
    }
}
