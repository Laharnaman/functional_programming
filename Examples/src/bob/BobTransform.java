package bob;

import java.util.ArrayList;
import java.util.List;
import static bob.Folks.friends;

public class BobTransform {

	public static void main(String[] args) {

		/**
		 * This still requires the empty list. Can do better! final List<String>
		 * upperCaseNames = new ArrayList<String>(); friends.forEach(name ->
		 * upperCaseNames.add(name.toUpperCase()));
		 * System.out.println(upperCaseNames);
		 */

		// friends.stream()
		// .map(name -> name.toUpperCase())
		// .forEach(name -> System.out.print(name + " "));

		friends.stream()
			//.map(name -> name.length())
			.map(String::toUpperCase)  //using a method reference
			.forEach(count -> System.out.print(count + " "));

	}

}
