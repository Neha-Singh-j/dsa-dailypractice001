// Last updated: 7/26/2026, 10:55:57 PM
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=arr[i];
        }
        Arrays.sort(arr2);
        int maxA=Integer.MIN_VALUE;
        int maxB=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<n;i++){
            maxA=Math.max(maxA,arr[i]);
            maxB=Math.max(maxB,arr2[i]);
            if(maxA==maxB) c++;
        }
        return c;
    }
}