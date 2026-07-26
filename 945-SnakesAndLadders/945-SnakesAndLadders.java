// Last updated: 7/26/2026, 10:55:08 PM
class Solution {
    public int snakesAndLadders(int[][] board) {
        // st !=1 and n*n
        // having stair from r and c to-> boeard[r][c] value 
        //choosing next=> curr+1,min(Curr+6,n^2) any random value
        int n=board.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n*n+1];
        q.offer(1);
        vis[1]=true;
        int m=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int j=0;j<s;j++){
                //1. remove
                int curr=q.poll();
                if(n*n==curr) return m; // self work
                //add nbr
                for(int i=1;i<=6;i++){
                    int nxt=curr+i;
                    if(nxt> n*n) break;
                    int[] idx=get(nxt,n);
                    int r=idx[0];
                    int c=idx[1];
                    if(board[r][c]!=-1){
                        nxt=board[r][c];
                    }
                    if(!vis[nxt]){
                        vis[nxt]=true;
                        q.offer(nxt);
                    }
                }

            }
            m++;
        }
        return -1; //no possiblity
    }
    // converting (1-> n*n) to row and col
    public static int[] get(int n1, int n){
        int[] arr=new int[2];
        int a=(n1-1)/n;
        int b=(n1-1)%n;
        if(a%2==1){
            b=(n-1-b); // as in snake game alternate left to right and right to left 
        }
        return new int[]{n-1-a,b}; //bcz row starts from top convert that to bottom
    }
}