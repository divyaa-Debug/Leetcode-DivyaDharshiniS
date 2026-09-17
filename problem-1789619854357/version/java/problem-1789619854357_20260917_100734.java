// Last updated: 17/09/2026, 10:07:34
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11public class Solution {
12    public ListNode swapPairs(ListNode head) {
13         if (head == null || head.next == null) {
14            return head;
15        }
16        
17        ListNode dummy = new ListNode(0);
18        dummy.next = head;
19        ListNode current = dummy;
20        
21         while (current.next != null && current.next.next != null) {
22            ListNode first = current.next;
23            ListNode second = current.next.next;
24            
25             first.next = second.next;
26            second.next = first;
27            current.next = second;
28            
29             current = first;
30        }
31        
32        return dummy.next;
33    }
34}