// Last updated: 7/26/2026, 10:58:39 PM
class Solution {
    public int integerReplacement(int n) {
        HashMap<Long,Integer> dp=new HashMap<>();
       return replace((long) n,dp);
    }
    public static int replace(long n,HashMap<Long, Integer> dp){
        //base case 
        if(n==1){
            return 0;
        }
        if(dp.containsKey(n)) return dp.get(n);
        int ans=0;
        if(n%2==0){
            ans=replace(n/2,dp)+1;
        }else{
            int minusOne=replace(n-1,dp);
            int plusOne=replace(n+1,dp);
            ans= Math.min(minusOne ,plusOne)+1;
        }
        dp.put(n,ans);
        return ans;

    }
}