// Last updated: 24/09/2026, 12:27:02
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null) return null;
19
20         Node curr = head;
21        while (curr != null) {
22            Node copy = new Node(curr.val);
23            copy.next = curr.next;
24            curr.next = copy;
25            curr = copy.next;
26        }
27
28         curr = head;
29        while (curr != null) {
30            if (curr.random != null) {
31                curr.next.random = curr.random.next;
32            }
33            curr = curr.next.next;
34        }
35
36         curr = head;
37        Node copiedHead = head.next;
38        while (curr != null) {
39            Node copy = curr.next;
40            curr.next = copy.next;
41            if (copy.next != null) {
42                copy.next = copy.next.next;
43            }
44            curr = curr.next;
45        }
46
47        return copiedHead;
48    }
49}