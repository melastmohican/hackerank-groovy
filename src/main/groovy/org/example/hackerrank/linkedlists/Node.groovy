package org.example.hackerrank.linkedlists


class Node {
    int data;
    Node next;

    public Node() {
        this(0)
    }

    public Node(int data) {
        this.data = data
    }

    static Node getAt(Node head, int position) {
        if (!head) return -1
        Node node = head
        while (position--) {
            node = node.next
        }
        return node
    }

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
        if (node) {
            while (node.next) {
                result += node.data
                node = node.next
            }
            result += node.data
        }
        result
    }
}
