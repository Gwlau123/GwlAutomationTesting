package operator;

public class RelationalOperator {

	public static void main(String[] args) {

		// create variables
		int a = 50, b = 10;

		// value of a and b
		System.out.println("a is " + a + " and b is " + b);

		// == operator
		System.out.println("Is a equal b :" + (a == b)); // false

		// != operator
		System.out.println("Is a not equal b :" + (a != b)); // true

		// > operator
		System.out.println("Is a greater than b :" + (a > b)); // false

		// < operator
		System.out.println("Is a less than b :" + (a < b)); // true

		// >= operator
		System.out.println("Is a greater than or equal  to b :" + (a >= b)); // false

		// <= operator
		System.out.println("Is a less than or equal to b :" + (a <= b)); // true
		
		
		/**
		 * Instance of examples
		 * */
		String str = "Disha";
		System.out.println("Value of str "+ str);

		System.out.println(str instanceof String);
		
		/**
		 * Equals examples
		 * */
		String str1 = "Disha";
		String str2 = new String("Disha");
		System.out.println("Value of str1= "+ str + " str2= "+ str2);

		// Incorrect usage
		System.out.println("Compare two strings object "+str1 == str2);
		
		// Correct usage
		System.out.println("Compare two strings object "+str1.equals(str2));
		
		
		
	}
}
