// Last updated: 7/15/2026, 9:27:35 AM
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
4
5        for (int x : stones) {
6            pq.add(x);
7        }
8
9        while (pq.size() > 1) {
10            int a = pq.poll();
11            int b = pq.poll();
12            if (a != b) {
13                pq.add(a - b); // a > b always in max-heap
14            }
15        }
16
17        return pq.isEmpty() ? 0 : pq.peek();
18    }
19}