package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.List;

public class StreamSortedEx2 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Rajkumar");
		list.add("Vishnuvardhan");
		list.add("Shankarnag");
		list.add("Shivarajkumar");
		list.add("Ravichandran");
		
		System.out.println(list);
		
		List<String> sortedList=(List<String>) list.stream().sorted().collect(Collectors.toList());
		System.out.println("String sort by default using Comparator : "+sortedList);
		
		sortedList = (List<String>)list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("String sort by default using Comparable : "+sortedList);
		
		sortedList = (List<String>)list.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("String descending sort by using Comparable : "+sortedList);
		
		sortedList = (List<String>)list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("String descending sort by using Comparable : "+sortedList);

	}

}
