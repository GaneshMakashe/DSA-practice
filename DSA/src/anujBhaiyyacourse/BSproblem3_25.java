package anujBhaiyyacourse;


import java.util.stream.IntStream;

//minimise the maximum numbers of pages read by a student
public class BSproblem3_25 {

	
	static int minPages(int[] a, int k) {
		int min=maxOf(a);
		int max=sumOf(a);
		int res=0;
		while(min<=max) {
			int mid=(min+max)/2;
			if(isFeasible(a,k,mid)) {
				res=mid;
				max=mid-1;
			}else {
				min=mid+1;
			}
		}
		return res;
	}
	
	
	static int sumOf(int[] a) {
		int sum = IntStream.of(a).sum();
		return sum;
	}
	
	
	static int maxOf(int[] a) {
		int i;
        int max = a[0]; 
        for (i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
		return max;
	}
	
	
	static boolean isFeasible(int[] a, int k, int res) {
		int student=1,sum=0;
		for(int i=0;i<a.length;i++) {
			if(sum+a[i]>res) {
				student++;
				sum=a[i];
			}
			else {
				sum +=a[i];
			}
		}
		return student <=k;
	}
	
	
	public static void main(String[] args) {
		int[] a= {10,5,20,30,20,30,40};
		System.out.println(minPages(a, 7));
	}

}
