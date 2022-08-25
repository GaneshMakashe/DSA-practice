package stackBasics;

import java.util.ArrayDeque;

public class StackProblem {

	//brutforce
	static int maximnumAreaInHistogram(int a[]) {
		int n=a.length;
		int max=0;
		for(int i=0;i<n;i++) {
			int l=i,r=i;
			while(l>=0 && a[l]>=a[i]) l--;
			while(r<n && a[r]>=a[i]) r++;
			
			int width=(r-l-1);
			int curArea=a[i]*width;
			max=Math.max(max, curArea);
		}
		return max;
	}
	
	//index will return 
	static int[] previousSmaller(int a[]) {
		int ans[]=new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i=0;i<a.length;i++) {
			int e=a[i];
			while(!stack.isEmpty() && a[stack.peek()]>=e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=-1; 
			}else {
			ans[i]=stack.peek();
		    }
			stack.push(i);
		}
		return ans;
	}
	
	static int[] nextSmaller(int a[]) {
		int ans[]=new int[a.length];
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		for(int i=a.length-1;i>=0;i--) {
			int e=a[i];
			while(!stack.isEmpty() && a[stack.peek()]>=e) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i]=a.length; 
			}else {
			ans[i]=stack.peek();
		    }
			stack.push(i);
		}
		return ans;
	}
	
	static int maximumAreaInHistogramOptimizies(int[] a) {
		int[] ps=previousSmaller(a);
		int[] ns=nextSmaller(a);
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			int width=ns[i]-ps[i]-1;
			int curArea=width*a[i];
			max=Math.max(max, curArea);
		}
		return max;
	}
	
	
	static int maxAreaSubMatrix(int[][] a) {
		int b[] = new int[a[0].length];
		int max=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length-1;j++) {
				if(a[i][j]==0) {
					b[j]=0;
				}else {
					b[j]++;
				}
			}
			int cur=maximumAreaInHistogramOptimizies(b);
			max=Math.max(max, cur);
		}
		return max;
	}

	
	
	public static void main(String[] args) throws Exception {
		
//		TwoStack obj = new TwoStack(5);
//		obj.push1(10);
//		obj.push1(20);
//		
//		obj.push2(30);
//		obj.push2(40);
//		obj.push2(60);
//		
//		System.out.println(obj.pop1());
//		System.out.println(obj.pop1());
//		//System.out.println(obj.pop1());
//		
//		System.out.println(obj.pop2());
//		System.out.println(obj.pop2());
//		//System.out.println(obj.pop2());
//		
		
//		int a[]= {4,3,9,2,5,1,8,3 };
//		System.out.println(maximnumAreaInHistogram(a));
//		System.out.println(maximumAreaInHistogramOptimizies(a));
//		int ps[]=previousSmaller(a);
//		int ns[]=nextSmaller(a);
//		for(int e: ns) {
//			System.out.print(e+" ");
//		}

//		int[][] a= {
//				{1,1,0,1},
//				{1,1,1,1},
//				{1,1,1,1},
//				{1,1,1,0}};
//		
//		System.out.println(maxAreaSubMatrix(a));
		
		MinStack21 minStack =new MinStack21();
		minStack.push(10);
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(1);
		System.out.println(minStack.min());
		minStack.pop();
		minStack.push(5);
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(10);
		System.out.println(minStack.min());
		
		
	}

}


