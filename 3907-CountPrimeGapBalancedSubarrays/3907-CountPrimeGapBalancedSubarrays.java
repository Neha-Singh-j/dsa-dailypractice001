// Last updated: 7/21/2026, 11:50:34 AM
class Solution {
    private boolean[] prime;

    public int primeSubarray(int[] nums, int k) {
        int n = nums.length, max = 0;

        //  maximum value in nums for sieve limit
        for (int num : nums) max = Math.max(max, num);

        TreeMap<Integer, Integer> map = new TreeMap<>(); //sorted order track
        int primes = 0;

        // l1 -left ptr with atmmost one prime (invalid subarray counts so atlast we can substract that from total count)
        // l2 -> checking preime gap <=k
        int l1 = 0, l2 = 0;

        sieve(max);

        // cnt 1- count subarray atlmost one prime
        // cntK - count subarray with prime gap <= k
        int cntK = 0, cnt1 = 0;
        for (int r = 0; r < n; r++) {
            if (prime[nums[r]]) { //check if prime then put in window
                primes++;
                map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            }

            while (primes > 1) {
                if (prime[nums[l1]]) primes--;
                l1++;
            }

            // Maintain window [l2..r] with (maxPrime - minPrime) <= k
            while (!map.isEmpty() && map.lastKey() - map.firstKey() > k) {
                if (prime[nums[l2]]) {
                    map.put(nums[l2], map.get(nums[l2]) - 1);
                    if (map.get(nums[l2]) == 0) map.remove(nums[l2]);
                }
                l2++;
            }

            
            cnt1 += (r - l1 + 1); //valid subarrays with atleast 2 prime 
            cntK += (r - l2 + 1); //maximum possible with gap of <=k 
        }
        return cntK - cnt1;
    }

    private void sieve(int n) {
        prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }
}
