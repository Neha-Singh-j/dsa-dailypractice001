// Last updated: 7/26/2026, 10:58:01 PM
class Solution {
    public int hammingDistance(int x, int y) {
        //logic 2 if we peform xor of given numbers we get 1 if only diffrernet digits are there then count them
        int xor=x^y;
        int c=0;
        while(xor>0){
            c+=xor&1;
            xor=xor>>1;
        }
        return c;
    }
}