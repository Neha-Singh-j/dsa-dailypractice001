// Last updated: 7/26/2026, 10:50:13 PM
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //make graph 
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            if(!map.containsKey(u)){
                map.put(u,new ArrayList<>());
            }
             if(!map.containsKey(v)){
                map.put(v,new ArrayList<>());
            }
            map.get(u).add(v);
            map.get(v).add(u);
        }
        return path(map,source,destination);
    }
    public static boolean path(HashMap<Integer,List<Integer>> map,int src, int des){
        HashSet<Integer> vis=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        vis.add(src);
        q.add(src);
        while(!q.isEmpty()){
            //remove
            int r=q.poll();
            //ignore if visited
            if(r==des) return true;
            if(vis.contains(r)){
                
            }
            //mark visited
            vis.add(r);
            //self work
            //add nbrs
            for(int nbr: map.get(r)){
                if(!vis.contains(nbr)){
                    q.add(nbr);
                    vis.add(nbr);
                }
            }
        }
        return false;
    }
}