package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(15);
		list.add(50);
		list.add(70);
		list.add(15);
		
		System.out.println(list);
		List<Integer> distinctList=list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct List : "+distinctList);

	}

}
