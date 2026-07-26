// Last updated: 7/26/2026, 10:50:31 PM
class Solution {
    public int countPaths(int n, int[][] roads) {

        // graph: node -> (neighbor -> cost)
        HashMap<Integer, HashMap<Integer, Integer>> graph = new HashMap<>();

        // initialize
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashMap<>());
        }
        for (int[] r : roads) {
            graph.get(r[0]).put(r[1], r[2]);
            graph.get(r[1]).put(r[0], r[2]);
        }
        long[] dist=new long[n];
        int ways[]=new int[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        ways[0]=1;
        dist[0]=0;
        int mod=1000000007;
        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        pq.add(new long[]{0,0});
        while(!pq.isEmpty()){
            long[] curr=pq.poll();
            int node=(int) curr[0];
            long d=curr[1];
            if(d>dist[node]) continue;
            for(int nbr: graph.get(node).keySet()){
                long newdist=d+graph.get(node).get(nbr);
                if(newdist<dist[nbr]){
                    dist[nbr]=newdist;
                    ways[nbr]=ways[node];
                    pq.add(new long[]{nbr,newdist});
                }else if(newdist==dist[nbr]){
                    ways[nbr]=(ways[node]+ways[nbr])%mod;
                }
            }
        }
        return ways[n-1];
    }
}