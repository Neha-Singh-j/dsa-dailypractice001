// Last updated: 7/26/2026, 10:53:43 PM
class Solution {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int mod = 1000000007;
        int n = arr.length;
        long curr = 0, maxSum = 0;
        if(k==1){
            for (int i = 0; i < n; i++) {
                curr += arr[i % n];
                maxSum = Math.max(maxSum, curr);
                if (curr < 0) curr = 0;
            }
            return (int)(maxSum % mod);
        }
        for (int i = 0; i < 2 * n; i++) {
            curr += arr[i % n];
            maxSum = Math.max(maxSum, curr);
            if (curr < 0) curr = 0;
        }
        
        // total sum of array
        long total = 0;
        for (int i : arr) total += i;

        if (k > 2 && total > 0) {// doing this for only for positve total sum 
            maxSum += (k - 2) * total;
        }

        return (int)(maxSum % mod);
    }
}
