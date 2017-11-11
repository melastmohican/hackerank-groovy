package org.example.hackerrank.linkedlists

/**
 * You’re given the pointer to the head node of a doubly linked list. Reverse the order of the nodes in the list. The head node might be NULL to indicate that the list is empty.

 Input Format You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the doubly linked list. You should NOT read any input from stdin/console.

 Output Format Change the next and prev pointers of all the nodes so that the direction of the list is reversed. Then return the head node of the reversed list. Do NOT print anything to stdout/console.

 Sample Input

 NULL
 NULL <-- 2 <--> 4 <--> 6 --> NULL

 Sample Output

 NULL
 NULL <-- 6 <--> 4 <--> 2 --> NULL
 */
class ReverseDoubly {
    static class Node {
        int data
        Node next
        Node prev

        static def fromArray(int[] a) {
            Node head = new Node()
            Node prev = null
            Node node = head
            Node next = null

            int idx = 0
            while (node) {
                node.prev = prev
                node.data = a[idx++]
                next = idx < a.length ? new Node() : null
                node.next = next
                prev = node
                node = next
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

    Node reverse(Node head) {
        Node temp = null
        Node current = head
        while (current) {
            temp = current.prev
            current.prev = current.next
            current.next = temp
            current = current.prev
        }

        if (temp) {
            head = temp.prev
        }

        head
    }
}
