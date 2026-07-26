// Last updated: 7/26/2026, 10:55:28 PM
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        List<Pair> al=new ArrayList<>();
        for(int i=0;i<indices.length;i++){
            al.add(new Pair(indices[i],sources[i],targets[i]));
        }
        Collections.sort(al, (a, b) -> a.index - b.index);
        StringBuilder sb = new StringBuilder();
        int st = 0;

        for (int i = 0; i < al.size(); i++) {
            Pair p=al.get(i);
            int idx = p.index;
            String src = p.src;
            String tgt = p.target;
            if (idx < st) continue;
            if (st < idx) {
                sb.append(s.substring(st, idx));
            }
        if (idx + src.length() <= s.length()&& s.substring(idx, idx + src.length()).equals(src)) {
                sb.append(tgt);
                st = idx + src.length();
            } else {
                st = idx; 
            }
        }

        sb.append(s.substring(st));

        return sb.toString();
    }
    static class Pair{
        int index;
        String src;
        String target;

        Pair(int index, String src, String target) {
            this.index=index;
            this.src=src;
            this.target=target;
        }
    }
}
