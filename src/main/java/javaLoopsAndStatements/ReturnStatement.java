package javaLoopsAndStatements;

public class ReturnStatement {

	public static void main(String[] args) {
		System.out.println(ReturnStatement.testReturn());
	}
	
	static String testReturn() {
		int num=0;
		
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
}
