package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedUsingComparable {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(6);
		list.add(26);
		list.add(2);
		list.add(35);
		
		System.out.println(list);
		
		List<Integer> sortedList = (List<Integer>)list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Ascending sort by using Comparable : "+sortedList);
		
		sortedList = (List<Integer>)list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Descending sort by using Comparable : "+sortedList);
		
		sortedList = (List<Integer>)list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Descending sort by using Comparable : "+sortedList);
		

	}

}
