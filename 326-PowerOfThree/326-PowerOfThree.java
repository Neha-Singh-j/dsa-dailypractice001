// Last updated: 7/26/2026, 10:59:27 PM
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n<=0){
            return false;
        }else if(n==1){
            return true;
        }
        while(n>1){
            if(n%3!=0){
            return false;
        }
        n=n/3;
        
    }
    return true;
}
}