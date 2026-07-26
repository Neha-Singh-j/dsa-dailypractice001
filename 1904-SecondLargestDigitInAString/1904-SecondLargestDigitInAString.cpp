// Last updated: 7/26/2026, 10:51:07 PM
class Solution {
public:
    int secondHighest(string s) {
        int a=-1;
        int b=-1;
        for(char c:s){
            if(isdigit(c)){
                int curr=c-'0';
                if(curr>a){
                    int temp=a;
                    a=curr;
                    b=temp;
                }else if(curr>b && curr<a){
                    b=curr;
                }
            }
        }
        if(b==-1) return -1;
        return b;
    }
};