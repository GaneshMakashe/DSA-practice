package heaps;

public class Mainclass {

	public static void main(String[] args) throws Exception {
		
//		MinHeap mh=new MinHeap(4);
//		mh.insert(2);
//		mh.insert(10);
//		mh.printHeap();
//		System.out.println("");
//		System.out.println(mh.extractMin());
//		mh.printHeap();
//		System.out.println("");
//		mh.insert(15);
//		mh.insert(1);
//		mh.printHeap();
//		System.out.println("");
//		System.out.println(mh.extractMin());
//		mh.printHeap();
		
		int a[]= {0,2,9,4,7,1,6,8};
		MinHeap mh=new MinHeap(a);
		mh.printHeap();
		mh.heapSort();
		
		
		
		

	}

}
