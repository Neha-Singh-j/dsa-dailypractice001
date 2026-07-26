// Last updated: 7/26/2026, 10:52:55 PM
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr=new int[2];
        for(int i=1;i<n;i++){
            if(NonZero(i)&& NonZero(n-i)){
                arr[0]=i;
                arr[1]=n-i;
            }
        }
        return arr;
    }
    public static boolean NonZero(int n){
        while(n>0){
            if(n%10==0) return false;
            n/=10;
        }
        return true;
    }
}