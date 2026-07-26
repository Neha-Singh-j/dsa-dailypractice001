// Last updated: 7/26/2026, 10:50:24 PM
import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        HashSet<String> map = new HashSet<>();
        for(String s : nums){
            map.add(s);
        }
        int x = 0;
        int y = (int)Math.pow(2,n) - 1;

        for(int i = x; i <= y; i++){

            String curr = deciTobin(i, n);

            if(!map.contains(curr)){
                return curr;
            }
        }

        return "";
    }

    public static String deciTobin(int num, int n){

        StringBuilder sb = new StringBuilder();

        while(num > 0){
            int rem = num % 2;
            sb.append(rem);
            num = num / 2;
        }

        while(sb.length() < n){
            sb.append('0');
        }

        return sb.reverse().toString();
    }
}