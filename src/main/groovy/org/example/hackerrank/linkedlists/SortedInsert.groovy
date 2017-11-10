package org.example.hackerrank.linkedlists

/**
 *
 Node is defined as
 class Node {int data
 Node next
 Node prev}* Given a reference to the head of a doubly-linked list and an integer, data, create a new Node object having data value data and insert it into a sorted linked list.

 Complete the Node* SortedInsert(Node* head, int data) method in the editor below. It has two parameters:

 head: A reference to the head of a doubly-linked list of Node objects.
 data: An integer denoting the value of the data field for the Node you must insert into the list.
 The method must insert a new Node into the sorted (in ascending order) doubly-linked list whose data value is data without breaking any of the list's double links or causing it to become unsorted.

 Note: Recall that an empty list (i.e., where head == null) and a list with one element are sorted lists.

 Input Format

 Do not read any input from stdin. Hidden stub code reads in the following sequence of inputs and passes head and data to the method:

 The first line contains an integer, q, denoting the number of lists that will be checked. The 2 * q subsequent lines describe the elements to insert into each list over two lines:

 The first line contains an integer, n, denoting the number of elements that will be inserted into the list.
 The second line contains n space-separated integers describing the respective data values that your code must insert into the list during each call to the method. Output Format
 Do not print anything to stdout. Your method must return a reference to the head of the same list that was passed to it as a parameter. The custom checker for this challenge checks the list to ensure it hasn't been modified other than to properly insert the new Node in the correct location.

 Sample Input

 1
 3
 2 5 4

 Sample Output

 2 4 5
 */
class SortedInsert {

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

    Node sortedInsert(Node head, int data) {
        Node node = new Node()
        node.data = data

        if (!head) return node

        if (head.data > data) {
            node.next = head
            head.prev = node
            head = head.prev
            return head
        }

        Node next = head.next
        Node current = head

        while (next) {
            if (data < next.data) {
                current.next = node
                node.prev = current
                node.next = next
                next.prev = node
                return head
            }
            next = next.next
            current = current.next
        }

        current.next = node
        node.prev = current

        return head
    }
}
