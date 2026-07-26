// Last updated: 7/26/2026, 10:53:33 PM
class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        return LIS(arr,difference);
    }
    public static int LIS(int[] arr,int diff) {
		HashMap<Integer,Integer>dp=new HashMap<>(); //optimised dp form 
        int res=0;

		for (int i = 0; i <arr.length; i++) {
            int curr=dp.getOrDefault(arr[i]-diff,0);
            int len=curr+1;
            dp.put(arr[i],len);
            res=Math.max(res,len);
			
		}
		return res;
    }
}