package lambdaexpressions.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(10);
		marks.add(40);
		marks.add(60);
		marks.add(70);
		marks.add(80);
		marks.add(15);
		
		System.out.println("Before 5 grace marks : "+marks);
		List<Integer> updatedMarks=(List<Integer>)marks.stream().map(m->m+5).collect(Collectors.toList());
		System.out.println("After 5 grace marks : "+updatedMarks);
		
		List<Integer> failedAfterGrace=(List<Integer>)updatedMarks.stream().filter(m->m<35).collect(Collectors.toList());
		System.out.println("Failed after grace : "+failedAfterGrace);
		
		long noOfFailed = updatedMarks.stream().filter(m->m<35).count();
		System.out.println("No of failed : "+noOfFailed);

	}

}
