package priorityQueue;

public class MainClass1 {

	boolean isMaxHeap(int a[]) {
		return isMaxHeap(a,0);
	}
	
	boolean isMaxHeap(int a[], int i) {
		int n=a.length;
		if(i>n/2) return true;
		int left=2*i+1;
		int right=2*i+2;
		
		boolean isLeft=left<n && a[i]>=a[left] && isMaxHeap(a,left);
		if(isLeft) {
			if(right<n) {
				return a[i]>=a[right]&&isMaxHeap(a,right);
			}else return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
