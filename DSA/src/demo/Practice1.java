package demo;

import java.time.LocalDate;

import queueBasics.MainClass;

public class Practice1 {
	
	

	public static void main(String[] args) {
	LocalDate l=LocalDate.of(2019, 3, 17);
	l=l.minusDays(18);
	l.minusMonths(1);
	
	
	
	System.out.println(l);
	
	
	}

}