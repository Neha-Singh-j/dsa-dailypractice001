// Last updated: 5/21/2026, 9:01:00 PM
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
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13        ListNode curr = head;
14        if (head == null || head.next == null || k == 0) {
15            return head;
16        }
17
18        int length = 1;
19        while (curr.next != null) {
20            curr = curr.next;
21            length++;
22        }
23        k = k % length;
24        if (k == 0) {
25            return head;
26        }
27
28        curr.next = head;
29        int steps = length - k;
30        ListNode newtail = head;
31        int i = 1;
32        while (i < steps) {
33            newtail = newtail.next;
34            i++;
35        }
36        ListNode newhead = newtail.next;
37        newtail.next = null;
38
39        return newhead;
40    }
41}