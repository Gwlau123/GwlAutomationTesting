package operator;

public class RelationalOperator {
	
		  public static void main(String[] args) {
		    
		    // create variables
		    int a = 50, b = 10;

		    // value of a and b
		    System.out.println("a is " + a + " and b is " + b);

		    // == operator
		    System.out.println("Is a equal b :"+(a == b));  // false

		    // != operator
		    System.out.println("Is a not equal b :"+(a != b));  // true

		    // > operator
		    System.out.println("Is a greater than b :"+(a > b));  // false

		    // < operator
		    System.out.println("Is b greater than a :"+(a < b));  // true

		    // >= operator
		    System.out.println("Is a greater than or equal  to b :"+(a >= b));  // false

		    // <= operator
		    System.out.println("Is b greater than or equal  to a :"+(a <= b));  // true
		  }
		}

