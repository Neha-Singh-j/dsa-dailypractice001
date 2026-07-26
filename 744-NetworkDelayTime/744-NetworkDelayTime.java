// Last updated: 7/26/2026, 10:56:02 PM
class Solution {
    HashMap<Integer,HashMap<Integer,Integer>> map;
    public int networkDelayTime(int[][] times, int n, int k) {
        map=new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i,new HashMap<>());
        }
        for(int[] t: times){
            AddEdge(t[0],t[1],t[2]);
        }
       
        return  Dijkstra(n,k);
    }
    public int Dijkstra(int n, int src){
        PriorityQueue<DijkstraPair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        HashSet<Integer> vis=new HashSet<>();
        int ans=0;
        pq.add(new DijkstraPair(src,0));
        while(!pq.isEmpty()){
            //remove
            DijkstraPair r= pq.poll();
            //check if already visited then ignore
            if(vis.contains(r.vtx)) continue;
            //mark visit4ed
            vis.add(r.vtx);

            //add nbrs
            ans=r.cost;
            for(int nbr: map.get(r.vtx).keySet()){
                if(!vis.contains(nbr)){
                    int c=map.get(r.vtx).get(nbr);
                    pq.add(new DijkstraPair(nbr,r.cost+c));
                }
            }

        }
        return vis.size()==n ? ans : -1;
    }
    public void AddEdge(int src, int tar, int cost){
        map.get(src).put(tar,cost);
        
    }
}
class DijkstraPair{
    int vtx;
    int cost;
     DijkstraPair(int vtx, int cost){
        this.vtx=vtx;
        this.cost=cost;
    }
}