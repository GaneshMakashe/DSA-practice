package anujBhaiyyacourse;
//revise
import java.util.Stack;

//max area in a histogram
public class Stack_44 {

	    static int maxArea(int[] a) {
		int maxAns=0;
		int[] ps=prevSmaller(a);
		int[] ns=nextSmaller(a);
		for(int i=0;i<a.length;i++) {
			int cur = (ns[i]-ps[i]-1)*a[i];
			maxAns = Math.max(maxAns, cur);
		}
		return maxAns;
	}
	
	
	private static int[] nextSmaller(int[] a) {
		int[] ns = new int[a.length];
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<a.length;i++) {
			while(!s.isEmpty() && a[s.peek()]>=a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				
				ns[i] = -1;
			}else {
				ns[i]=s.peek();
			}
			s.push(i);
		}
		return ns;
	}


	private static int[] prevSmaller(int[] a) {
		int ps[] = new int[a.length];
		Stack<Integer> s = new Stack<>();
		for(int i=0;i<a.length;i++) {
			while(!s.isEmpty() && a[s.peek()]>=a[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				
				ps[i] = -1;
			}else {
				ps[i]=s.peek();
			}
			s.push(i);
		}
		return ps;
	}

	public static void main(String[] args) {
		int[] a= {3,1,2,4};
//		System.out.println(maxArea(a));
	}
}
