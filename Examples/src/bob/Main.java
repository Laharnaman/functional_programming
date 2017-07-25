package bob;

//import static bob.Folks.friends;

import java.util.function.Consumer;
import static bob.Folks.friends;
public class Main {
	/**
	 * Type inference (ie not supplying final String) means the args
	 * are non final - hence could be modified.
	 * Best practice is to exercise the extra discipline and type the params.
	 */
	static Consumer<String> printNames = System.out::println;
			//also valid
			// (final String s) ->  System.out.println("Hi "+ s); //explicit typing (BEST!)
			// (s) ->  System.out.println("Hi "+ s);
			//  s  ->  System.out.println("Hi "+ s);
			//extra conciseness (p.23)
			//System.out::println
	
	
	public static void main(String[] args) {
		friends.stream()
		.filter(name -> !name.contains("S"))
		.forEach(printNames);
		//.forEach(printNames);
		//.forEach( (final String s) -> {System.out.println("Hi "+ s);System.out.println("------");});
		//friends.forEach( s -> System.out.println("Hi "+ s));

	}

}
