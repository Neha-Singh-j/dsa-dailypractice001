// Last updated: 7/26/2026, 10:50:04 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new LinkedList<>();
        int n=tickets.length;
        for(int i=0;i<n;i++){
            q.add(new int[]{i,tickets[i]});
        }
        int c=0;
        while(!q.isEmpty()){
            int[] x=q.poll();
            x[1]--;
            c++;
            // if this is person k and no tickets left - stop
            if (x[0] == k && x[1] == 0) {     //taking care of this index==k
                break;
            }
            // if still needs tickets, go back to queue
            if (x[1] > 0) {
                q.add(x);
            }
        }
        return c;
    }
}