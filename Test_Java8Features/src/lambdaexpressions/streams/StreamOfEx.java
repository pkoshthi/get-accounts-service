package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamOfEx {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(36);
		list.add(50);
		list.add(4);
		list.add(15);
		
		Integer[] iArr=list.stream().toArray(Integer[]::new);
		Stream.of(iArr).forEach(System.out::println);

		
		//
		
		Stream<Integer> s=Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
	}

}
