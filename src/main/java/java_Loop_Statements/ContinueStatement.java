package java_Loop_Statements;

public class ContinueStatement {

	public static void main(String[] args) {
		int num;

		System.out.println("Loop1:");
		
		for(num=0 ; num<10 ; num++) {
			if(num==5) {
				System.out.println("num == "+num+" so SKIPPED");
				continue;
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
					continue again1;
				}
				System.out.println(num+" < 5 inside INNER loop");
			}
			if(num==7) {
				System.out.println("num == "+num+" so jumped to \"again2\"");
				continue again2;
			}
			System.out.println(num+" < 5 inside OUTER loop");
		}
	}
}