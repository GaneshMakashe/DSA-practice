package anujBhaiyyacourse;

import java.util.HashMap;
import java.util.Map;

//count the distinct elements of every window of size k
public class HashingProblem_29 {

	
	static void counDistinct(int[] a, int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<k;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		System.out.println(map.size());
		for (int i=k;i<a.length;i++) {
			if(map.get(a[i-k]) == 1)
				map.remove(a[i-k]);
			else
				map.put(a[i-k], map.get(a[i-k])-1);
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
			System.out.println(map.size());
		}
	}
	public static void main(String[] args) {
		int[] a = {1,2,2,1,3,1,1,3};
		counDistinct(a, 4);

	}

}
