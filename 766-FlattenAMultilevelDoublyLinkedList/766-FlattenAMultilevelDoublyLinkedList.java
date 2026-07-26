// Last updated: 7/26/2026, 10:55:59 PM
class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        Node curr = head;
        Stack<Node> st=new Stack<>();
        while(curr!=null){
             if (curr.child != null) {
                 if (curr.next != null) 
                    st.push(curr.next);
                curr.next=curr.child;
                curr.child.prev = curr; 
                curr.child=null;
            }
            if(curr.next==null && !st.isEmpty()){
                    Node pop=st.pop();
                    curr.next=pop;
                    pop.prev = curr; 
            }
            curr=curr.next;
        }
        return head;
    }
}
