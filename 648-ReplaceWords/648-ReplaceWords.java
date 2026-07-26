// Last updated: 7/26/2026, 10:56:34 PM
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder ans=new StringBuilder();
        //make trie of dictionary and return at first terminal----to make smallest length word
        // cat or catt 
        String[] arr=sentence.split(" ");
		
        StringBuilder sb=new StringBuilder();
		Trie t=new Trie();
		for(int i=0;i<dictionary.size();i++) {
			t.insert(dictionary.get(i));
		}
		for(String s: arr) {
			sb.append(t.search(s)+" ");
		}
		return sb.toString().trim();

	}
	static class Trie{ //inner class ka object bna rhe ho ssliye aapko static bnana hoga
		class Node{
		char ch;
		String isTerminal;
		HashMap<Character,Node> child;
			public Node(char ch) {
				this.ch=ch;
				child=new HashMap<>();
			}
		}
		private Node root=new Node('*');
		public void insert(String word) { //complexity of insert = length of word 
			Node curr=root;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if(curr.child.containsKey(ch)){
					curr=curr.child.get(ch); //already there so just move current 
				}else {
					Node nn=new Node(ch); 
					curr.child.put(ch,nn);
					curr=nn;
				}
			}
			curr.isTerminal=word; //now we are returning that word not boolean
		}
		public String search(String word) {
			Node curr=root;
			for(int i=0;i<word.length();i++) {
				char ch=word.charAt(i);
				if(curr.child.containsKey(ch)) {
					curr=curr.child.get(ch);
					if(curr.isTerminal!=null) {
						return curr.isTerminal;
					}
				}else {
					return word;
				}
			}
			return word;
		}
		
	}
}