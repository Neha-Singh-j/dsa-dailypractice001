// Last updated: 7/21/2026, 11:49:21 AM
class Solution {
    static int mx= 20000; 
    public int[] minOperations(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
       for (int x = 1; x <= mx; x++) {
            if (checkPalin(x)) {
                al.add(x);
            }
        }
        int n = nums.length;
        int[] op = new int[n];
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            int max2 = Integer.MAX_VALUE;
             int pos =findLlimit(al, curr);
            if (pos < al.size()) {
                max2 = Math.min(max2, Math.abs(curr - al.get(pos)));
            }
            if (pos - 1 >= 0) {
                max2 = Math.min(max2, Math.abs(curr - al.get(pos - 1)));
            }
            op[i] = max2;
        }

        return op;
    }

    public static int findLlimit(ArrayList<Integer> arr, int target) {
        int l = 0, r = arr.size();
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) >= target) r = mid;
            else l = mid + 1;
        }
        return l;
    }
    public static  boolean checkPalin(int x) {
        String s = Integer.toBinaryString(x);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++; r--;
        }
        return true;
    }
}