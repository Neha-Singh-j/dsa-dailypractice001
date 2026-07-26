// Last updated: 7/26/2026, 10:58:25 PM
class Solution {
    public int findMaximumXOR(int[] nums) {
        // Trie+ bitmasking
        Trie t=new Trie() ;
		for(int x:nums) {
			t.add(x);
		}
		int ans=0;
		for(int x: nums) {
			ans=Math.max(t.getMaxXor(x), ans);
		}
        return ans;
	}
	
	static class Trie{
		class Node{
			Node zero;
			Node one;
		}
		
		private Node root=new Node(); //star Node
		
		public void add(int val) {
			Node curr=root;//32 bit number
			for(int i=31;i>=0;i--) {
				//mask ka and with 1 k left shift i times 
				//agr 1 child hoga to pahucha denge otherwise bna denge
				int bit=val&(1<<i);
				if(bit==0) {
					if(curr.zero!=null) { //zerro bala child hai
						curr=curr.zero;
						
					}else {
						Node nn=new Node();
						curr.zero=nn;
						curr=nn;
					}
				}else {
					if(curr.one!=null) { //zerro bala child hai
						curr=curr.one;
						
					}else {
						Node nn=new Node();
						curr.one=nn;
						curr=nn;
					}
				}
			}
		}
		
		public int getMaxXor(int x) {
			int ans=0;
			Node curr=root;
			for(int i=31;i>=0;i--) {
				int bit=x& (1<<i);
				if(bit==0) { //search for 1
					if(curr.one!=null) {
						ans=ans | (1<<i); // + ,or 
						curr=curr.one;
					}else {
						curr=curr.zero;
					}
				}else { //search for 2
					if(curr.zero!=null) {
						ans=ans | (1<<i); // + ,or 
						curr=curr.zero;
					}else {
						curr=curr.one;
					}
				}
			}
			return ans;
		}
	}
}
