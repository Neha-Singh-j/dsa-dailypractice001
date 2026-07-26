// Last updated: 7/26/2026, 10:53:23 PM
class Solution {
    class Job{ //making job pair to sort all things collectively 
        int st;
        int end;
        int pro;
        public Job(int st, int end, int pro){
            this.st=st;
            this.end=end;
            this.pro=pro;
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        Job[] jobs=new Job[n];
        for(int i=0;i<n;i++){
            jobs[i]=new Job(startTime[i],endTime[i],profit[i]);
        }
        Arrays.sort(jobs,(a,b)->a.st-b.st);//sorted based on start time 
        return solve(dp,n,0,jobs);
        
    }
    public int solve(int[]dp, int n,int i, Job[] jobs){
        if(i>=jobs.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int b=solve(dp,n,i+1,jobs); //exclusion
        int next=find(i,jobs); // find next start>=end of current
        int a=jobs[i].pro+solve(dp,n,next,jobs);
        return dp[i]=Math.max(a,b);
    }
    public int find(int i, Job[] jobs){
        int lo=i+1;
        int hi=jobs.length-1;
        int ans=jobs.length;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(jobs[mid].st>=jobs[i].end){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}