// Last updated: 6/15/2026, 9:07:02 PM
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
12    public ListNode deleteMiddle(ListNode head) {
13        ListNode temp=null;
14        ListNode slow=head;
15        ListNode fast=head;
16        if(slow.next==null){
17            return null;
18        }
19        if(fast.next.next==null){
20            fast.next=null;
21            return head;
22        }
23        while(fast!=null &&  fast.next!=null){
24            temp=slow;
25            slow=slow.next;
26            fast=fast.next.next;
27        }
28        temp.next=slow.next;
29        return head;
30    }
31}