// Last updated: 7/26/2026, 10:52:48 PM
class Solution {
    public int minJumps(int[] arr) {
        return bfs(arr);
    }
    public int bfs(int[]arr){
        int n = arr.length;
        if (n == 1) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(arr[i], x -> new ArrayList<>()).add(i);
        }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(0);
        set.add(0);
        int c=0;
        while(!q.isEmpty()){
            int size=q.size();
           for(int k=0;k<size;k++){
            //remove
            int i=q.poll();
            if(i==n-1) return c;
            //self work and mark visited
            if(i-1>=0 && set.contains(i-1)==false){
                set.add(i-1);
                q.add(i-1);
            }
             if(i+1<arr.length && set.contains(i+1)==false){
                set.add(i+1);
                q.add(i+1);
            }
            //adding nbrs
            if (map.containsKey(arr[i])) {
                for (int j : map.get(arr[i])) {
                    if (!set.contains(j)) { //not visited then only go to that index
                         set.add(j);
                         q.add(j);
                     }
                }
                map.remove(arr[i]); 
            }
        }
            c++;
        }
        return c;
    }
}