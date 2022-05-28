package anujBhaiyyacourse;

import java.util.HashSet;
//add();
//contains();
//remove();
//isEmpty();
//size();
//clear();
//important functions
public class Hashing_26 {

	public static void main(String[] args) {
		HashSet<Integer> s = new HashSet<>();
		s.add(5);
		s.add(10);
		System.out.println(s);
		if(s.contains(10)) {
			System.out.println("Present");
		}else {
			System.out.println("Not Present");
		}
		s.remove(10);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.clear();
	}

}
