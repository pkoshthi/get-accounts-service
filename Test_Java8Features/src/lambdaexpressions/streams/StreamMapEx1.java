package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


// Program to double the each number in the list and map to new list
public class StreamMapEx1 {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		List<Integer> doubleList=(List<Integer>)al.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(doubleList);

	}

}
