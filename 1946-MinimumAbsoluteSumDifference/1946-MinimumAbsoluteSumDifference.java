// Last updated: 7/26/2026, 10:50:52 PM
class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int mod=1000000007;
        int n=nums1.length;
        int[] nums=new int[n];
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.abs(nums1[i]-nums2[i]); //calc diffreence
            nums[i]=nums1[i]; //making copy
        }
    
        Arrays.sort(nums);
        long min=sum;
        for(int i=0;i<n;i++){
            int curr=Math.abs(nums1[i]-nums2[i]); //current fidrenec of ith idx
            int lo=0,hi=n-1;
            while(lo<hi){
                int mid=(lo+hi)/2;
                if(nums[mid]<nums2[i]) lo=mid+1;
                else hi=mid;
            }
            int bst=Math.min(curr,Math.abs(nums[lo]-nums2[i]));// after soritng searching for closest value to nums2[i]

            if(lo>0) bst=Math.min(bst,Math.abs(nums[lo-1]-nums2[i])); // just smaller value can also give more closest answer so if any lo-1 exist just check that also
            min=Math.min(min,sum-curr+bst); // removing previous diff (Curr) then aadding new diffrence that is minimum
        }
        return (int)(min % mod);

    }
}