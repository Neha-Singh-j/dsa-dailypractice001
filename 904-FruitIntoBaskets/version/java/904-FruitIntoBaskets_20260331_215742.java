// Last updated: 3/31/2026, 9:57:42 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3        Map<Integer, Integer> map = new HashMap<>();
4        int left = 0, maxLen = 0;
5
6        for (int right = 0; right < fruits.length; right++) {
7            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
8
9            while (map.size() > 2) {
10                map.put(fruits[left], map.get(fruits[left]) - 1);
11                if (map.get(fruits[left]) == 0) {
12                    map.remove(fruits[left]);
13                }
14                left++;
15            }
16
17            maxLen = Math.max(maxLen, right - left + 1);
18        }
19
20        return maxLen;
21    }
22}