// Last updated: 7/26/2026, 10:54:52 PM
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q=new LinkedList<>();
        int n=deck.length;
        Arrays.sort(deck);
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int i=0;
        while(q.size()>1){
            int c=q.poll();
            int back=q.poll();
            ans[c]=deck[i];
            i++;
            q.add(back);
        }
        ans[q.poll()]=deck[i];
        return ans;
    }
}