// Last updated: 7/26/2026, 10:51:51 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        TreeMap<Character, Integer> w1 = new TreeMap<>();
        TreeMap<Character, Integer> w2 = new TreeMap<>();
        for(int i=0;i<word1.length();i++){
            char ch=word1.charAt(i);
            w1.put(ch,w1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<word2.length();i++){
            char ch=word2.charAt(i);
            w2.put(ch,w2.getOrDefault(ch,0)+1);
        }
        //checking same charcters are there in both strings or diffrerrnt becuase new char cant we added
        if (!w1.keySet().equals(w2.keySet())) return false; 

//checking values of each char i mean freq should be same in both 
        List<Integer> f1 = new ArrayList<>(w1.values());
        List<Integer> f2 = new ArrayList<>(w2.values());

        Collections.sort(f1);
        Collections.sort(f2);

        return f1.equals(f2);
    }
}