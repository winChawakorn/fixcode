package fixcode;

import java.util.Scanner;

/**
 * The test methods in this class demonstrate why a class's equals method should
 * always be declared "boolean equals(Object arg)" instead of
 * "boolean equals(Person arg)" or "boolean equals(Student arg)".
 * 
 * Student the main() method and run the code. Can you explain why "equals"
 * gives the wrong answer?
 *
 * Then fix the equals() in the Person class until it works correct.
 * 
 * @author Chawakorn Suphepre
 * @version 2017.01.22
 */
public class Main {
	private static final Scanner console = new Scanner(System.in);

	/**
	 * Compare two Person objects using their equals method.
	 * 
	 * @param a
	 *            first person to compare
	 * @param b
	 *            second person to compare
	 */
	public static void testPersonEquals(Person a, Person b) {
		System.out.println("> Compare Person a and Person b");
		boolean result = a.equals(b);
		System.out.println("a.equals(b) is " + result);
	}

	/**
	 * Compare any two objects using their equals method.
	 * 
	 * @param a
	 *            first object to compare
	 * @param b
	 *            second object to compare
	 */
	public static void testObjectEquals(Object a, Object b) {
		System.out.println("> Compare Object a and Object b");
		boolean result = a.equals(b);
		System.out.println("a.equals(b) is " + result);
	}

	/**
	 * Tell user to press ENTER when ready.
	 * 
	 * @param message
	 *            is the message that will printed before telling user to pres
	 *            enter
	 */
	public static void prompt(String message) {
		System.out.println();
		System.out.print(message);
		System.out.print(" [press enter]");
		console.nextLine();
	}

	/** Method main that used to run this equal test. */
	public static void main(String[] args) {
		System.out.println("Compare two Persons that are different");
		Person a = new Person("Cat");
		Person b = new Person("Mouse");
		System.out.println("Person a is " + a);
		System.out.println("Person b is " + b);
		prompt("Press ENTER to start:");

		testPersonEquals(a, b);
		testObjectEquals(a, b);

		System.out.println("\nCompare two Persons that should be same");
		a = new Person("Cat");
		b = new Person("Cat");
		System.out.println("Person a is " + a);
		System.out.println("Person b is " + b);
		prompt("Press ENTER to start:");

		testPersonEquals(a, b);
		testObjectEquals(a, b);

		prompt("\nCompare a Person and a Student");
		Person c = new Student("Cat", 1111);
		System.out.println("a is " + a);
		System.out.println("c is " + c);
		System.out.println("a.equals(c) is " + a.equals(c));
		System.out.println("c.equals(a) is " + c.equals(a));
		System.out
				.print("\nThe result should be 'false'. Person is not same as Student.");

	}

}
