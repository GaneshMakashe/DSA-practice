package demo;

public class Practice3 {

	public static Integer sum(int[] ints){
		int add=0;
        for(int i=0;i<ints.length;i++){
            add += ints[i];
        }
        return add;
    }
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		System.out.println(sum(a));

	
	}
}
