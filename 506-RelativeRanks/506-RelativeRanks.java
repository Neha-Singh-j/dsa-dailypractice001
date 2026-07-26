// Last updated: 7/26/2026, 10:57:44 PM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<score.length;i++){
            pq.add(new int[]{score[i],i});
        }
        String[] ans=new String[score.length];
        
        if(score.length==1){
            int[] c1=pq.poll();
            ans[c1[1]]="Gold Medal";
            return ans;
        }
        int r=1;
        while(!pq.isEmpty()){
            int curr[]=pq.poll();
            int idx = curr[1];
            if (r == 1) ans[idx] = "Gold Medal";
            else if (r == 2) ans[idx] = "Silver Medal";
            else if (r == 3) ans[idx] = "Bronze Medal";
            else ans[idx] = String.valueOf(r);
            r++;
        }
        return ans;
    }
}