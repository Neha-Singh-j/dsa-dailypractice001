// Last updated: 7/26/2026, 10:52:25 PM
class Solution {
    public String arrangeWords(String text) {
        String[] s=text.split(" ");
        s[0]=s[0].toLowerCase(); // now all in small letters
        //using treeMpa becuse sorted order of keys....here for length
        Map<Integer,ArrayList<String>> map=new TreeMap<>(); //length wise bucket creation and preserving order as per text when length are same
        for(String curr:s){
            if(map.containsKey(curr.length())){
                map.get(curr.length()).add(curr);
            }else{
                map.put(curr.length(),new ArrayList<>());
               map.get(curr.length()).add(curr);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int key: map.keySet()){
            for(int i=0;i<map.get(key).size();i++){
                sb.append(map.get(key).get(i));
                sb.append(" ");
            }
        }
        System.out.println(sb);
        sb.deleteCharAt(sb.length()-1);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
}