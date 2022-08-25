package demo;


public class Problem1 {

	static int highestMark(int input1, int input2, int[] input3) {
		int sum = 0;
		sort(input3);
		int[] d = reverse(input3, input1);
		for (int i = 0; i < input2; i++) {
			sum += d[i];
		}
		return sum;
	}

	static int[] reverse(int[] a, int b) {
		int[] c = new int[b];
		int j = b;
		for (int i = 0; i < b; i++) {
			c[j - 1] = a[i];
			j = j - 1;
		}
		return c;
	}

	static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] c = { 4, 1, 2, 5,6,7};
		System.out.println(highestMark(6, 4, c));
	}

}
