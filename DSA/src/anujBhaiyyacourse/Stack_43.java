package anujBhaiyyacourse;

import java.util.Stack;

//parenthesis Matching Problem
//s="(({}))"--->true
//="(({]})"--->false
public class Stack_43 {

	 static boolean isPatenthesisMatching(String str) {
		Stack<Character> s = new Stack<>();
		for(int i=0;i<str.length();i++) {
			char cur = str.charAt(i);
			if(isOpening(cur)) {
				s.push(cur);
			}
			else {
				if(s.isEmpty()) {
					return false;
				}
				else if(!isMatching(s.peek(),cur)){
					return false;
				}
				else {
					s.pop();
				}
			}
		}
		return s.isEmpty();
	}
	static boolean isMatching(char a, char b) {
		return (a == '(' && b == ')') || 
			   (a == '{' && b == '}') ||
			   (a == '[' && b == ']');
	} 
	static boolean isOpening(char c) {
		return c=='(' || 
			   c=='{' ||
			   c=='[';
	}
	public static void main(String[] args) {
		String str="()([])";
		if(isPatenthesisMatching(str)) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}

	}

}
