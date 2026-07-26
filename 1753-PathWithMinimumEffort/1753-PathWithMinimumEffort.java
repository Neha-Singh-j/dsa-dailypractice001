// Last updated: 7/26/2026, 10:52:01 PM
import java.util.*;

class Solution {

    public int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];

        for(int[] d : dist){
            Arrays.fill(d,Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a,b)->a[0]-b[0]);

        pq.add(new int[]{0,0,0});
        dist[0][0] = 0;

        while(!pq.isEmpty()){

            int[] p = pq.poll();

            int eff = p[0];
            int x = p[1];
            int y = p[2];

            if(x==n-1 && y==m-1)
                return eff;

            if(x+1<n){
                int newEff=Math.max(eff,
                        Math.abs(heights[x+1][y]-heights[x][y]));
                if(newEff < dist[x+1][y]){
                    dist[x+1][y]=newEff;
                    pq.add(new int[]{newEff,x+1,y});
                }
            }

            if(x-1>=0){
                int newEff=Math.max(eff,
                        Math.abs(heights[x-1][y]-heights[x][y]));
                if(newEff < dist[x-1][y]){
                    dist[x-1][y]=newEff;
                    pq.add(new int[]{newEff,x-1,y});
                }
            }

            if(y+1<m){
                int newEff=Math.max(eff,
                        Math.abs(heights[x][y+1]-heights[x][y]));
                if(newEff < dist[x][y+1]){
                    dist[x][y+1]=newEff;
                    pq.add(new int[]{newEff,x,y+1});
                }
            }

            if(y-1>=0){
                int newEff=Math.max(eff,
                        Math.abs(heights[x][y-1]-heights[x][y]));
                if(newEff < dist[x][y-1]){
                    dist[x][y-1]=newEff;
                    pq.add(new int[]{newEff,x,y-1});
                }
            }
        }

        return 0;
    }
}