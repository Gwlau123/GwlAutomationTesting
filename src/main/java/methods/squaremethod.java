package methods;

public class squaremethod {

	// create a method
	 

	  public static void main(String[] args) {
	    int result;

	    // call the method
	    // store returned value to result
	    result = square(10);

	    System.out.println("Squared value of 10 is: " + result);
	    
	    
	  }
	
public static int square(int num) {

    // return statement
    return num * num;
  }
}