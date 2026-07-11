// Last updated: 7/12/2026, 12:16:37 AM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i: nums){
            if(i>=0){
                arr.add(i);
            }
        }
        int n=arr.size();
        if(n==0) return nums;
        // rotate(arr,k);
        ArrayList<Integer> curr=new ArrayList<>();
        for(int i=0;i<n;i++){
            curr.add(0);
        }
        for(int i=0;i<n;i++){
            curr.set(i,arr.get((i+k)%n));
        }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=curr.get(j);
                j++;
            }
        }
        return nums;
    }
    /*public static void rotate(ArrayList<Integer> arr, int k){
        int n = arr.size();
        if(n==0) return;
		k = k % n;
		while (k > 0) {
            int item = arr.get(0);
            for (int i = 1; i < n; i++) {
                arr.set(i - 1, arr.get(i));
            }
            arr.set(n - 1, item);
            k--;
        }
    } */
}