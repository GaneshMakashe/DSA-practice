package paidAnujBhaiyaAssisgnments;



public class FrequencyofAllTheElements {

	//self made code
	public static int frequencyOfElements(int[] a, int key) {
		 int count=0;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]==key) {
				 count++;
			 }
		 }
		return count;
	}
	
	public static void main(String[] args) {
		int[] a = {5,4,5,3,2,4,4};
		System.out.println(frequencyOfElements(a, 5));
		
	}

}
