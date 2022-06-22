package java_Loop_Statements;

public class forLoop {

	static int num=5;   						// Scope level: Class
	
	public static void main(String[] arg) {

		System.out.println("num = "+num);

		System.out.println("\nLoop1:");
		
		for(num=0 ; num<10 ; ) {
			if(num<10)
				System.out.println(num+" < 10 inside LOOP2");
			if(num==10) {
				// Scope level: Main method (at LOWER level)
				num=0;
				break;
			}
			// Scope level: Main method (at HIGHER level)
			num++;
		}
		
		System.out.println("\nnum = "+num);

		System.out.println("\nLoop2:");
		
		// Scope level: for loop
		for(num=0 ; num<=10 ; num++) {   
			if(num<10)
				System.out.println(num+" < 10 inside LOOP2");
			if(num==10) {
				// Scope level: Main method (at LOWER level)
				num=0;
				break;
			}
		}

		System.out.println("\nnum = "+num);
	}
}
