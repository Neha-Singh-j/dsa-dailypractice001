// Last updated: 7/13/2026, 12:09:06 PM
1class Solution {
2    public List<Integer> sequentialDigits(int low, int high) {
3      
4        List<Integer> arr=new ArrayList<>();
5          int num=0;
6          int x=1;
7          int j=x;
8        for(int i=x;i<=9;i++){
9            num=num*10+j;
10            j++;
11            if(num>=low &&num<=high){
12
13                arr.add(num);
14            }
15            if(num>high ||j>9){
16                num=0;
17                j=x+1;
18                x++;
19                i=x-1;
20              
21            }
22        }
23        
24         Collections.sort(arr);
25       
26        return arr;
27    }
28}