// Last updated: 7/26/2026, 10:56:20 PM
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        // Step 1: create nodes
        for(int i = 1; i <= edges.length; i++){
            create(i);
        }
        // Step 2: process edges
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            
            // if same parent → cycle
            if(find(u) == find(v)){
                return edges[i];
            }
            
            // else union
            union(u, v);
        }
        return new int[0];
    }

    class Node{
        int val;
        int rank;
        Node parent;
    }

    private HashMap<Integer,Node> map=new HashMap<>();

    public void create(int v) {
        Node nn=new Node();
        nn.val=v;
        nn.rank=0;
        nn.parent=nn;
        map.put(v, nn);
    }

    public int find(int v) {
        Node node=map.get(v);
        return find(node).val;
    }

    private Node find(Node node) {
        if(node.parent==node) {
            return node;
        }
        Node n=find(node.parent);
        node.parent=n; // path compression
        return n;
    }

    public void union(int v1, int v2) {

        Node node1=map.get(v1);
        Node node2=map.get(v2);

        Node re1=find(node1);
        Node re2=find(node2);

        if(re1 == re2) return;

        // union by rank
        if(re1.rank == re2.rank) {
            re1.parent = re2;
            re2.rank++;
        }
        else if(re1.rank < re2.rank) {
            re1.parent = re2;
        }
        else {
            re2.parent = re1; 
        }
    }
}