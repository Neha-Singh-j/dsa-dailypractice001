// Last updated: 7/12/2026, 12:16:35 AM
class Solution {
    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e: edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        int cnt=0;
        int[] xd=bfs(x,graph,n);
        int[] yd=bfs(y,graph,n);
        int[] zd=bfs(z,graph,n);
        
        for(int i=0;i<n;i++){
            int a=xd[i],b=yd[i],c=zd[i];
             int[] arr = {a, b, c};
            Arrays.sort(arr);
            if ((long)arr[0] * arr[0] + (long)arr[1] * arr[1] == (long)arr[2] * arr[2]) {
                cnt++;
            }
        }
        return cnt;
    }
    public int[] bfs(int src, ArrayList<ArrayList<Integer>> graph, int n){
         int[] dist = new int[n];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        dist[src] = 0;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int nei : graph.get(node)) {
                if (dist[nei] == -1) {
                    dist[nei] = dist[node] + 1;
                    q.add(nei);
                }
            }
        }
        return dist;
    }
}