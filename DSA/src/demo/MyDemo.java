package demo;

import java.util.Optional;

public class MyDemo{
	
	public static void main(String[] sl) {
		Integer intVar1=null;
		Integer intVar2=new Integer(110);
		Optional<Integer> optionalVar1=Optional.ofNullable(intVar1);
		Optional<Integer> optionalVar2=Optional.of(intVar2);
		System.out.println(optionalVar1.orElse(new Integer(0))+optionalVar2.get());
	}
}

