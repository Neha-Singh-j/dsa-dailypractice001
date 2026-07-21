// Last updated: 7/21/2026, 11:52:36 AM
class Solution {
    public int maximizeWin(int[] arr, int k) {
        int n=arr.length;
        int l=0;
        int max=0;
        int[] prefix=new int[n];
        for(int i=0;i<n;i++){
            //segment one from l to r
            while(arr[i]-arr[l]>k){
                l++;
            }
            int curr=i-l+1;
            prefix[i]=curr;
            if (i > 0) {
                prefix[i] = Math.max(prefix[i], prefix[i - 1]);
            }
            //segment 2
             int prev = 0;
             if(l>0){
                prev=prefix[l-1];
             } 
            max = Math.max(max, curr + prev);
        }
        return max;
    }
}