package lambdaexpressions.streams;

import java.util.ArrayList;

public class StreamToArrayEx {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(36);
		list.add(50);
		list.add(4);
		list.add(15);
		
		Integer[] iArr=list.stream().toArray(Integer[]::new);
		
		for(Integer i:iArr)
		{
			System.out.println(i);
		}
	}

}
