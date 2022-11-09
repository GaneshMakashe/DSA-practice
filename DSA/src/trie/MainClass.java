package trie;

public class MainClass {

	public static void main(String[] args) {
		Trie obj=new Trie();
		String[] dic= {"Apple","Car","app","abc","abcd"};
		for(String s:dic) {
			obj.insert(s);
		}
		System.out.println(obj.search("abc"));
		obj.delete("abcd");
		System.out.println(obj.search("abcd"));

	}

}
