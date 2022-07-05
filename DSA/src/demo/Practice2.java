package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Practice2 {

	

	    /*
	     * Complete the 'plusMinus' function below.
	     *
	     * The function accepts INTEGER_ARRAY arr as parameter.
	     */
	    public static void plusMinus(int[] arr) {
	        double positive=0;
	        double negative=0;
	        double zero =0;
	        int i=0;
	        int n=arr.length;
	        while(i < n) 
			{
	        	if(arr[i]>0) positive++;
				if(arr[i] < 0) {
					negative++;
				}
				if(arr[i]==0) zero++;
				i++;
			}
	    
	    System.out.println(positive/n);
	 
	    System.out.println(negative/n);
	  
	    System.out.println(zero/n);
	    }

	

	
	    public static void main(String[] args) throws IOException {
	        int[] a= {-4,6,-3,0,4,1};
	        plusMinus(a);
	    }
	
}
