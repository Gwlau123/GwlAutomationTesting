package java_Loop_Statements;

public class whileLoop {
	
	public static void main(String[] arg) {
		int num=0;

		System.out.println("Loop1:");
		
		while(num>0 && num<10) {
			System.out.println(num+" >0 and <10 inside LOOP1");
			num++;
		}

		System.out.println("\nLoop2:");
		
		num=1;
		
		while(num>0 && num<10) {
			System.out.println(num+" >0 and <10 inside LOOP2");
			num++;
		}
	}
}
