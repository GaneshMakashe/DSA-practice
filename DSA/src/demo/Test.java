package demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test {

	public static void main(String[] args) {
	LocalDateTime Idt=LocalDateTime.of(2020, 5,10,11,22,33);
	var f= DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
	System.out.println(Idt.format(f));


	}

}
