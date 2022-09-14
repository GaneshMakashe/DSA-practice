package demo;



public class Test {

	static void m1(StringBuffer s1) {
		s1=s1.append("B");
		System.out.println(s1);
	}
	
	static void m2(StringBuffer s1) {
		s1=s1.append("C");
		System.out.println(s1);
	}
	
	
	public static void main(String[] args) throws Exception {
		StringBuffer s1=new StringBuffer("A");
		m1(s1);
		m2(s1);
		System.out.println(s1);
		}

}


