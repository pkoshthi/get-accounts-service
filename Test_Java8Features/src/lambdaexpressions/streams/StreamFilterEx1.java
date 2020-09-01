package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

import java.util.List;


// Program to list(filter) the even numbers from the collection
public class StreamFilterEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(4);
		al.add(8);
		al.add(0);
		al.add(5);
		al.add(6);
		al.add(1);
		al.add(2);
		
		System.out.println(al);
		List<Integer> evenList=(List<Integer>)al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenList);	
	}

}
