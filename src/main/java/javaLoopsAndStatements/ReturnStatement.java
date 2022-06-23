package javaLoopsAndStatements;

public class ReturnStatement {

	public static void main(String[] args) {
		System.out.println(ReturnStatement.testReturn1());
		System.out.println(ReturnStatement.testReturn2());
	}
	
	static String testReturn1() {
		int num=0;

		System.out.println("\nLoop1");
		
		while(true) {
			if(num==10) {
				String statement="num == "+num+" so out of the loop";
				System.out.print("\nReturn String: ");
				return statement;
			}
			else {
				System.out.println(num+" is less then 10");
			}
			num++;
		}
	}

	static String testReturn2() {
		int i , j ;

		System.out.println("\nLoop2");
		
		for(i=0 ; true ; i++) {
			for(j=0 ; j<=4 ; j++) {
				if(i>4)
					return "\nTriangle printed";
				if(j<i)
					System.out.print("["+i+","+j+"]\t");
				else if(j==i) {
					System.out.print("["+i+","+j+"]\n");
				}
			}
		}
	}
}
