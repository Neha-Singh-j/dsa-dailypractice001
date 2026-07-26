// Last updated: 7/26/2026, 10:53:38 PM
import java.util.*;

class Solution {
    HashMap<Integer,HashMap<Integer,Double>> map;
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,new HashMap<>());
        }
        for(int i=0;i<edges.length;i++){
            AddEdge(edges[i][0],edges[i][1],succProb[i]);
            AddEdge(edges[i][1],edges[i][0],succProb[i]);
        }
        return Dijkstra(start_node,end_node);
    }

    public double Dijkstra(int src, int des){
        PriorityQueue<DijkstraPair> pq =
                new PriorityQueue<>((a,b)->Double.compare(b.cost,a.cost));
        HashSet<Integer> vis=new HashSet<>();
        pq.add(new DijkstraPair(src,1.0));
        while(!pq.isEmpty()){

            DijkstraPair r=pq.poll();

            if(vis.contains(r.vtx)) continue;

            vis.add(r.vtx);

            if(r.vtx==des) return r.cost;

            for(int nbr: map.get(r.vtx).keySet()){

                if(!vis.contains(nbr)){

                    double c=map.get(r.vtx).get(nbr);

                    pq.add(new DijkstraPair(nbr,r.cost*c));
                }
            }
        }

        return 0;
    }

    public void AddEdge(int src,int tar,double cost){
        map.get(src).put(tar,cost);
    }
}

class DijkstraPair{

    int vtx;
    double cost;

    DijkstraPair(int vtx,double cost){
        this.vtx=vtx;
        this.cost=cost;
    }
}