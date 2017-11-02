## Print the Elements of a Linked List

If you're new to linked lists, this is a great exercise for learning about them. Given a pointer to the head node of a linked list, print its elements in order, one element per line. If the head pointer is null (indicating the list is empty), don’t print anything.

**Input Format**

The void Print(Node* head) method takes the head node of a linked list as a parameter. Each struct Node has a data field (which stores integer data) and a next field (which points to the next element in the list).

**Note:** Do not read any input from stdin/console. Each test case calls the Print method individually and passes it the head of a list.

**Output Format**

Print the integer data for each element of the linked list to stdout/console (e.g.: using printf, cout, etc.). There should be one element per line.

**Sample Input**

This example uses the following two linked lists:

```
NULL  
1->2->3->NULL

``` 
NULL and Node 1 are the two head nodes passed as arguments to Print(Node* head).

**Note:** In linked list diagrams, -> describes a pointer to the next node in the list.

Sample Output

```
1
2
3
```

## Insert a Node at the Tail of a Linked List

You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

**Input Format** 
You have to complete the Node* Insert(Node* head, int data) method. It takes two arguments: the head of the linked list and the integer to insert. You should not read any input from the stdin/console.

Output Format 
Insert the new node at the tail and just return the head of the updated linked list. Do not print anything to stdout/console.

**Sample Input**

```
NULL, data =  2
2 --> NULL, data = 3

```
**Sample Output**

```
2 -->NULL
2 --> 3 --> NULL
```

## Insert a node at the head of a linked list

You’re given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer, insert this node at the head of the linked list and return the new head node. The head pointer given may be null meaning that the initial list is empty.

**Input Format** 
You have to complete the Node* Insert(Node* head, int data) method which takes two arguments - the head of the linked list and the integer to insert. You should NOT read any input from stdin/console.

**Output Format** 
Insert the new node at the head and return the head of the updated linked list. Do NOT print anything to stdout/console.

**Sample Input**

```
NULL , data = 1 
1 --> NULL , data = 2

```
**Sample Output**

```
1 --> NULL
2 --> 1 --> NULL
```

## Insert a node at a specific position in a linked list

You’re given the pointer to the head node of a linked list, an integer to add to the list and the position at which the integer must be inserted. Create a new node with the given integer, insert this node at the desired position and return the head node. A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The head pointer given may be null meaning that the initial list is empty.

**Input Format** 
You have to complete the Node* Insert(Node* head, int data, int position) method which takes three arguments - the head of the linked list, the integer to insert and the position at which the integer must be inserted. You should NOT read any input from stdin/console. position will always be between 0 and the number of the elements in the list (inclusive).

**Output Format** 
Insert the new node at the desired position and return the head of the updated linked list. Do NOT print anything to stdout/console.

**Sample Input**

```
NULL, data = 3, position = 0 
3 --> NULL, data = 4, position = 0

```
**Sample Output**
```
3 --> NULL
4 --> 3 --> NULL
```

## Delete a Node

You’re given the pointer to the head node of a linked list and the position of a node to delete. Delete the node at the given position and return the head node. A position of 0 indicates head, a position of 1 indicates one node away from the head and so on. The list may become empty after you delete the node.

**Input Format** 
You have to complete the Node* Delete(Node* head, int position) method which takes two arguments - the head of the linked list and the position of the node to delete. You should NOT read any input from stdin/console. position will always be at least 0 and less than the number of the elements in the list.

**Output Format** 
Delete the node at the given position and return the head of the updated linked list. Do NOT print anything to stdout/console.

**Sample Input**

```
1 --> 2 --> 3 --> NULL, position = 0 
1 --> NULL , position = 0

```
**Sample Output**

```
2 --> 3 --> NULL
NULL
```

## Print in Reverse

You are given the pointer to the head node of a linked list and you need to print all its elements in reverse order from tail to head, one element per line. The head pointer may be null meaning that the list is empty - in that case, do not print anything!

**Input Format** 
You have to complete the void ReversePrint(Node* head) method which takes one argument - the head of the linked list. You should NOT read any input from stdin/console.

**Output Format** 
Print the elements of the linked list in reverse order to stdout/console (using printf or cout) , one per line.

**Sample Input**

```
1 --> 2 --> NULL 
2 --> 1 --> 4 --> 5 --> NULL

```
**Sample Output**

```
2
1
5
4
1
2
```

## Reverse a linked list

You’re given the pointer to the head node of a linked list. Change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning that the initial list is empty.

**Input Format** 
You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the linked list. You should NOT read any input from stdin/console.

**Output Format** 
Change the next pointers of the nodes that their order is reversed and return the head of the reversed linked list. Do NOT print anything to stdout/console.

**Sample Input**

```
NULL 
2 --> 3 --> NULL

```
**Sample Output**

```
NULL
3 --> 2 --> NULL
```

## Compare two linked lists

You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked lists to check if they are equal. The lists are equal only if they have the same number of nodes and corresponding nodes contain the same data. Either head pointer given may be null meaning that the corresponding list is empty.

**Input Format** 
You have to complete the int CompareLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two linked lists to compare. You should NOT read any input from stdin/console.

**Output Format** 
Compare the two linked lists and return 1 if the lists are equal. Otherwise, return 0. Do NOT print anything to stdout/console.

**Sample Input**

```
NULL, 1 --> NULL 
1 --> 2 --> NULL, 1 --> 2 --> NULL

```
**Sample Output**

```
0
1
```

## Merge two sorted linked lists

You’re given the pointer to the head nodes of two sorted linked lists. The data in both lists will be sorted in ascending order. Change the next pointers to obtain a single, merged linked list which also has data in ascending order. Either head pointer given may be null meaning that the corresponding list is empty.

**Input Format** 
You have to complete the Node* MergeLists(Node* headA, Node* headB) method which takes two arguments - the heads of the two sorted linked lists to merge. You should NOT read any input from stdin/console.

**Output Format** 
Change the next pointer of individual nodes so that nodes from both lists are merged into a single list. Then return the head of this merged list. Do NOT print anything to stdout/console.

**Sample Input**

```
1 -> 3 -> 5 -> 6 -> NULL
2 -> 4 -> 7 -> NULL

15 -> NULL
12 -> NULL

NULL 
1 -> 2 -> NULL

```
**Sample Output**

```
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> NULL
12 -> 15 -> NULL
1 -> 2 -> NULL
```

## Get Node Value

You’re given the pointer to the head node of a linked list and a specific position. Counting backwards from the tail node of the linked list, get the value of the node at the given position. A position of 0 corresponds to the tail, 1 corresponds to the node before the tail and so on.

**Input Format** 
You have to complete the int GetNode(Node* head, int positionFromTail) method which takes two arguments - the head of the linked list and the position of the node from the tail. positionFromTail will be at least 0 and less than the number of nodes in the list. You should NOT read any input from stdin/console.

**Constraints** 
Position will be a valid element in linked list.

**Output Format** 
Find the node at the given position counting backwards from the tail. Then return the data contained in this node. Do NOT print anything to stdout/console.

**Sample Input**

```
1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 0
1 -> 3 -> 5 -> 6 -> NULL, positionFromTail = 2

```
**Sample Output**

```
6
3
```

## Delete duplicate-value nodes from a sorted linked list

You're given the pointer to the head node of a sorted linked list, where the data in the nodes is in ascending order. Delete as few nodes as possible so that the list does not contain any value more than once. The given head pointer may be null indicating that the list is empty.

For now do not be concerned with the memory deallocation. In common abstract data structure scenarios, deleting an element might also require deallocating the memory occupied by it. For an initial intro to the topic of dynamic memory please consult: http://www.cplusplus.com/doc/tutorial/dynamic/

**Input Format** 
You have to complete the Node* RemoveDuplicates(Node* head) method which takes one argument - the head of the sorted linked list. You should NOT read any input from stdin/console.

**Output Format** 
Delete as few nodes as possible to ensure that no two nodes have the same data. Adjust the next pointers to ensure that the remaining nodes form a single sorted linked list. Then return the head of the sorted updated linked list. Do NOT print anything to stdout/console.

**Sample Input**

```
1 -> 1 -> 3 -> 3 -> 5 -> 6 -> NULL
NULL

```
**Sample Output**

```
1 -> 3 -> 5 -> 6 -> NULL
NULL
```

## Cycle Detection

A linked list is said to contain a cycle if any node is visited more than once while traversing the list.

Complete the function provided for you in your editor. It has one parameter: a pointer to a Node object named  that points to the head of a linked list. Your function must return a boolean denoting whether or not there is a cycle in the list. If there is a cycle, return true; otherwise, return false.

Note: If the list is empty,  will be null.

**Input Format**

Our hidden code checker passes the appropriate argument to your function. You are not responsible for reading any input from stdin.

**Constraints**
0 <= list size <= 100

**Output Format**

If the list contains a cycle, your function must return true. If the list does not contain a cycle, it must return false. The binary integer corresponding to the boolean value returned by your function is printed to stdout by our hidden code checker.

**Sample Input**

The following linked lists are passed as arguments to your function:

```
1 -> NULL
1 -> 2 -> 3 -|
     <-------|
```
**Sample Inputs**
**Sample Output**

```
0
1
```

## Find Merge Point of Two Lists

Given pointers to the head nodes of  linked lists that merge together at some point, find the Node where the two lists merge. It is guaranteed that the two head Nodes will be different, and neither will be NULL.

In the diagram below, the two lists converge at Node x:

```
[List #1] a--->b--->c
                     \
                      x--->y--->z--->NULL
                     /
     [List #2] p--->q

```
Complete the int FindMergeNode(Node* headA, Node* headB) method so that it finds and returns the data value of the Node where the two lists merge.

**Input Format**

The FindMergeNode(Node*,Node*) method has two parameters, headA and headB, which are the non-null head Nodes of two separate linked lists that are guaranteed to converge. 
Do not read any input from stdin/console.

**Output Format**

Each Node has a data field containing an integer; return the integer data for the Node where the two lists converge. 
Do not write any output to stdout/console.

**Sample Input**

The diagrams below are graphical representations of the lists that input Nodes headA and headB are connected to. Recall that this is a method-only challenge; the method only has initial visibility to those  Nodes and must explore the rest of the 2 Nodes using some algorithm of your own design.

**Test Case 0**

```
 1
  \
   2--->3--->NULL
  /
 1

```
**Test Case 1**

```
1--->2
      \
       3--->Null
      /
     1

```
**Sample Output**

```
2
3
```

## Inserting a Node Into a Sorted Doubly Linked List

Given a reference to the head of a doubly-linked list and an integer, data, create a new Node object having data value data and insert it into a sorted linked list.

Complete the Node* SortedInsert(Node* head, int data) method in the editor below. It has two parameters:

1. head: A reference to the head of a doubly-linked list of Node objects.
2. data: An integer denoting the value of the data field for the Node you must insert into the list.

The method must insert a new Node into the sorted (in ascending order) doubly-linked list whose data value is data without breaking any of the list's double links or causing it to become unsorted.

**Note:** Recall that an empty list (i.e., where  head == null) and a list with one element are sorted lists.

**Input Format**

**Do not read any input from stdin.** Hidden stub code reads in the following sequence of inputs and passes head and data to the method:

The first line contains an integer, q, denoting the number of lists that will be checked. The 2 * q subsequent lines describe the elements to insert into each list over two lines:

1. The first line contains an integer, n, denoting the number of elements that will be inserted into the list.
2. The second line contains n space-separated integers describing the respective data values that your code must insert into the list during each call to the method.
**Output Format**

**Do not print anything to stdout.** Your method must return a reference to the head of the same list that was passed to it as a parameter. The custom checker for this challenge checks the list to ensure it hasn't been modified other than to properly insert the new Node in the correct location.

**Sample Input**

```
1
3
2 5 4

```
**Sample Output**

```
2 4 5
```

## Reverse a doubly linked list

You’re given the pointer to the head node of a doubly linked list. Reverse the order of the nodes in the list. The head node might be NULL to indicate that the list is empty.

**Input Format** 
You have to complete the Node* Reverse(Node* head) method which takes one argument - the head of the doubly linked list. You should NOT read any input from stdin/console.

**Output Format** 
Change the next and prev pointers of all the nodes so that the direction of the list is reversed. Then return the head node of the reversed list. Do NOT print anything to stdout/console.

**Sample Input**

```
NULL 
NULL <-- 2 <--> 4 <--> 6 --> NULL

```
**Sample Output**

```
NULL
NULL <-- 6 <--> 4 <--> 2 --> NULL
```