package stackBasics;

import java.util.ArrayDeque;

public class ExpressionSolveUsingStack {

	
	//infix to postfix
	static String infixToPostfix(String s) {
		StringBuilder sb= new StringBuilder();
		ArrayDeque<Character> stack=new ArrayDeque<>();
		
		for(int i=0;i<s.length();i++) {
			char cur=s.charAt(i);
			if(cur=='(') {
				stack.push(cur);
			}else if(cur==')') {
				while(stack.peek()!='(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}else if(isOperator(cur)) {
				while(!stack.isEmpty() && precedence(cur)<=precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(cur);
			}else {
				sb.append(cur);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

	 static boolean isOperator(char c) {
		return c=='+'||c=='-'||c=='*'||c=='/';
	}
	 
	 static int precedence(char c) {
		 if(c=='+' || c=='-') return 1;
		 else if(c=='*' || c=='/') return 2;
		 else return -1;
	 }
	 
	 static int calculate(int a, int b,char c) {
		 int res=0;
		 switch(c) {
		 case'+':
			 return a+b;
		 case'-':
			 return a-b;
		 case'*':
			 return a*b;
		 case'/':
			 return a/b;
		 }
		return res;
	 }
	 
	 //evaluate postfix
	 static int evaluatePostfix(String s) {
		 ArrayDeque<Integer> stack=new ArrayDeque<>();
		 int ans=0;
		 for(int i=0;i<s.length();i++) {
			 char cur=s.charAt(i);
			 if(isOperator(cur)) {
				 int second=stack.pop();
				 int first=stack.pop();
				 int eval=calculate(first, second, cur);
				 stack.push(eval);
			 }else {
				 stack.push(cur-'0');
			 }
		 }
		 return stack.pop();
	 }

	public static void main(String[] args) {
		String s="(2*3)-(4/5-6+7)";
		String output = infixToPostfix(s);
		int result = evaluatePostfix(output);
		System.out.println(result);

	}

}
