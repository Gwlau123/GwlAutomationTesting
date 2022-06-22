package javaLoopsAndStatements;

public class doWhileLoop {
	
	public static void main(String[] arg) {
		int num=0;

		System.out.println("Loop1:");
		
		do {
			System.out.println(num+" >0 and <10 inside LOOP1");
			num++;
		} while(num>0 && num<10);

		System.out.println("\nLoop2:");
		
		num=1;
		
		do {
			System.out.println(num+" >0 and <10 inside LOOP2");
			num++;
		} while(num>0 && num<10);
	}
}