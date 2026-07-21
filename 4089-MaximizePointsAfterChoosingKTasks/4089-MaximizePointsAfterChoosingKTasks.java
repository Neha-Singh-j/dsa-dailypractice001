// Last updated: 7/21/2026, 11:49:22 AM
class Solution {
    public long maxPoints(int[] tech1, int[] tech2, int k) {
        int n=tech1.length;
        int[] arr=new int[n];
        long c=0;
        for(int i=0;i<n;i++){
            arr[i]=tech1[i]-tech2[i];
            c+=tech2[i];
        }
        long res=c;
        Arrays.sort(arr);
        for(int i=n-k-1;i>=0;i--){
            if(arr[i]>0){
                res+=arr[i];
            }else{
                break;
            }
        }
        for(int i=n-1;i>=n-k;i--){
            res+=arr[i];
        }
        return res;
    }
}