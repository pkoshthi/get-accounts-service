package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(70);
		list.add(36);
		list.add(50);
		list.add(4);
		list.add(15);
		
		System.out.println("Before sort : "+list);
		List<Integer> sortedList=(List<Integer>)list.stream().sorted().collect(Collectors.toList());
		System.out.println("After sort : "+sortedList);
		
		sortedList=(List<Integer>)list.stream().sorted((i1,i2)->i1<i2?1:i1>i2?-1:0).collect(Collectors.toList());
		System.out.println("After descending sort : "+sortedList);

	}

}
