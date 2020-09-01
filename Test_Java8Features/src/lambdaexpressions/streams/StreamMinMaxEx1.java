package lambdaexpressions.streams;

import java.util.ArrayList;

public class StreamMinMaxEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(36);
		list.add(50);
		list.add(4);
		list.add(15);
		
		System.out.println(list);
		
		Integer min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Minimum : "+min);

		Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		
		System.out.println("Maximum : "+max);
	}

}
