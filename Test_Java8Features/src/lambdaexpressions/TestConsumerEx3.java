package lambdaexpressions;

import java.util.function.Consumer;

class Movie
{
	String name;
	
	public Movie(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
}

public class TestConsumerEx3 {

	public static void main(String[] args) {
		Movie m=new Movie("Spider");
		
		Consumer<Movie> c1=m1->System.out.println(m1+" ready to release");
		Consumer<Movie> c2=m2->System.out.println(m2+" released but it is bigger flop!!!");
		Consumer<Movie> c3=m3->System.out.println(m3+" storing information in database");
		
		c1.accept(m);
		
		System.out.println("\nConsumer chaining");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		cc.accept(m);

	}

}
