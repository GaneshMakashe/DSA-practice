package paidAnujBhaiyaAssisgnments;

public class ReplaceHighestElementRight {

	public static void repalceHighestElement(int[] a) {
		int max=0;
		for(int i=0;i<a.length;i++) {
			 max=0;
			 for(int j=i;j<a.length;j++) {
				 if(a[j]>max) {
					 max=a[j];
				 }
			 }
			 a[i]=max;
		}
	}
	
	
	
	public static void main(String[] args) {
		int[] a = {7,5,8,9,6,8,5,7,4,6};
		repalceHighestElement(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
