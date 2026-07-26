// Last updated: 7/26/2026, 10:51:44 PM
class Solution {
    public int[] maximizeXor(int[] arr, int[][] queries) {
      //sort nums and sort qureis based one mi but maintain index also so remapping req.....
        int[][] q=new int[queries.length][3];
		for(int i=0;i<q.length;i++) {
			q[i][0]=queries[i][0];
			q[i][1]=queries[i][1];
			q[i][2]=i; //i 
		}
		Arrays.sort(q,(a,b)->a[1]-b[1]);
		Arrays.sort(arr);
		Trie t=new Trie();
		int j=0;
		int[] ans=new int[q.length];
		for(int[]a:q) {
			while(j<arr.length && arr[j]<=a[1]) {
				t.add(arr[j]);
				j++;
			}
			if(j==0) {
				ans[a[2]]=-1;
			}else {
				ans[a[2]]=t.getMaxXor(a[0]);
			}
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
