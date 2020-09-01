package lambdaexpressions.streams;

import java.util.ArrayList;

public class StreamForEachEx {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(36);
		list.add(50);
		list.add(4);
		list.add(15);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}

		
		// Above one can be implemented by using Stream forEach as below
		System.out.println("\nUsing of Stream forEach");
		list.stream().forEach(System.out::println);
		
		
		System.out.println("\n");
		list.stream().forEach(i->System.out.println("The Square of "+i+" : "+(i*i)));
	}

}
