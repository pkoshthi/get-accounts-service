package lambdaexpressions.primitiveconsumer;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class TestIntConsumer {

	public static void main(String[] args) {
		
		// Find the square of an integer using Consumer
		System.out.println("Find the square of an integer using Consumer");
		Consumer<Integer> c=i->System.out.println(i*i);
		c.accept(5);
		
		//Find the square of an integer using IntConsumer
		System.out.println("\nFind the square of an integer using IntConsumer");
		IntConsumer intConsumer=i->System.out.println(i*i);
		intConsumer.accept(6);

	}

}
