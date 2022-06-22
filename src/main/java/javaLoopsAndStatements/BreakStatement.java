package javaLoopsAndStatements;

public class BreakStatement {

	public static void main(String[] args) {
		int num=0;

		System.out.println("Loop1:");
		
		for(num=0 ; num<10 ; num++) {
			if(num==5) {
				System.out.println(num+" == 5 so BROKE the loop");
				break;
			}
			System.out.println(num+" < 10");
		}
		
		System.out.println("\nLoop2:");
		
		// label to jump on
		again2:
		for(num=0 ; num<10 ; num++) {
			again1:
			for( ; num<5 ; num++) {
				if(num==2) {
					System.out.println("num == "+num+" so jumped to \"again1\"");
					break again1;
				}
				System.out.println(num+" < 5 inside INNER loop");
			}
			if(num==7) {
				System.out.println("num == "+num+" so jumped to \"again2\"");
				break again2;
			}
			System.out.println(num+" < 5 inside OUTER loop");
		}

	}
}
