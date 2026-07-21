// Last updated: 7/21/2026, 11:52:11 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode temp=rev(head);
        ListNode nn=new ListNode();
        ListNode dummy=nn;
       // ListNode temp=head;
        int carry=0;
        while(temp!=null){
            int val=temp.val*2;
            int rem=val%10;
            nn.next=new ListNode(rem+carry);
            carry=val/10;
            temp=temp.next;
            nn=nn.next;
        }
        if(carry>0){
           nn.next=new ListNode(carry);
        }
        dummy=dummy.next;
        
       
       return rev(dummy);
    }
    public ListNode rev(ListNode head) {
			ListNode curr = head;
			ListNode prev = null;
			while (curr != null) {
				ListNode ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			return prev;

		}
}