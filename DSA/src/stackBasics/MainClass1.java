package stackBasics;

import java.util.ArrayDeque;

public class MainClass1 {
	
	
	//previous smaller element
	static int[] previousSmaller(int a[]) {
		int ans[]=new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int i=0;
		for(int e: a) {
			while(!stack.isEmpty() && stack.peek()>=e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=-1; 
			}else {
			ans[i]=stack.peek();
		    }
			stack.push(e);
			i++;
		}
		return ans;
	}
	
	
	
	
	
	//matching parenthesis
	static boolean matchingParenthesis(String s) {
		ArrayDeque<Character> stack = new ArrayDeque<>();
		for(int i=0;i<s.length();i++) {
			char cur=s.charAt(i);
			if(cur=='('|| cur=='{'||cur=='[') {
				stack.push(cur);
				continue;
			}
			if(cur==')'||cur=='}'|| cur==']') {
				if(stack.isEmpty()) return false;
			}
			char top='a';
			switch(cur) {
			case')':
				top=stack.pop();
				if(top!='(') return false;
				break;
			case '}':
				top=stack.pop();
				if(top!='{') return false;
				break;
			case']':
				top=stack.pop();
				if(top!='[') return false;
				break;
			}
		}
		return stack.isEmpty();
		
	}

	public static void main(String[] args) {
		//String s="}{({})}{";
		//System.out.println(matchingParenthesis(s));
		
		int a[]= {4,1,3,5,2,1};
		int ans[]=previousSmaller(a);
		for(int e: ans) {
			System.out.println(e+" ");
		}

	}

}
