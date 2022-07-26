package demo;

public class Practice4 {

	
	public static int singleNumber(int[] nums) {
        int count=0;
        for(int i:nums){
            count ^=i;
            System.out.println(count);
        }
        return count;
    }
	
	 public static char findTheDifference(String s, String t) {
	        char c=0;
	        for(char cs:s.toCharArray()) c^=cs;
	        System.out.println(c);
	        for(char ct:t.toCharArray()) c^=ct;
	        System.out.println(c);
	        return c;
	    }
	
	public static void main(String[] args) {
//		int nums[]= {2,2,1};
//		System.out.println(singleNumber(nums));
		
		String s ="abcde";
		String t ="aedbcf";
		System.out.println(findTheDifference(s, t));
		

	}

}
