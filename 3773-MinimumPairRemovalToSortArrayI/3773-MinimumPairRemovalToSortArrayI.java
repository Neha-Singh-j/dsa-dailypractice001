// Last updated: 7/21/2026, 11:50:52 AM
class Solution {
    public int minimumPairRemoval(int[] nums) {
        int stp=0;
       while(!sorted(nums)){

            int min=0;
            int sum=Integer.MAX_VALUE;
            for(int i=1;i<nums.length;i++){
                int curr=nums[i-1]+nums[i];
                if(curr<sum){
                    min=i;
                    sum=curr;
                }
            }
            int[] pre=new int[nums.length-1];
            int j=0;
            for(int i=0;i<nums.length;i++){
                if(i==min-1){
                    pre[j]=sum;
                    j++;
                    i++; //skip next bcz sum added
                }
                else{
                    pre[j]=nums[i];
                    j++;
                }
            }   
            nums=pre;
            stp++;

       }
       return stp;
    }
    public static boolean sorted(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}