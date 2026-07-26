// Last updated: 7/26/2026, 10:48:27 PM
class Solution{
    public long minCost(int[] nums,int[] cost){
        int[][] arr=new int[nums.length][2];

        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        long total=0;

        for(int i=0;i<nums.length;i++){
            total+=arr[i][1];
        }

        long curr=0;
        int idx=0;

        for(int i=0;i<nums.length;i++){
            curr+=arr[i][1];

            if(curr*2>=total){
                idx=arr[i][0];
                break;
            }
        }

        long ans=0;

        for(int i=0;i<nums.length;i++){
            ans+=(long)Math.abs(arr[i][0]-idx)*arr[i][1];
        }

        return ans;
    }
}