package lambdaexpressions;

import java.util.function.Consumer;

/*
 Accept some input and perform required operationand not required to return anything --> Consumer
 
 interface Consumer<T>
 {
 	public void accept(T t);
 }
 */


public class TestConsumerEx1 {

	public static void main(String[] args) {
		Consumer<String> c =s->System.out.println(s);
		c.accept("India");
		c.accept("Karnataka");
	}

}
