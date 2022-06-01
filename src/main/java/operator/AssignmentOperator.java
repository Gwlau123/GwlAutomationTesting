package operator;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a;
		
		// = Operator
		a = 10;// a would be assign with value 10
		System.out.println("The value of a is equal to" + a);
		
		// += operator compound assignment operator or Add AND assignment operator.
		a += 10; // a= a+10
		System.out.println("The Value of  a after addition and assignment is " + a);// 20
		
		// -= Subtract AND assignment operator.
		a -= 10; // a=a-10
		System.out.println("The value of a after and subratcion and assignment is" + a);// 10
		
		// *= Multiply AND assignment operator
		a *= 10;// a=a*10
		System.out.println("The value of a after multiplication and assignmengt is " + a);// 100
		
		// /= Divide AND assignment operator.
		a /= 10;
		System.out.println("The value of a after divide and assignmemt is " + a);// 10
		
		// %= Modulus AND assignment operator
		a %= 10;
		System.out.println("The Value of a after modulus and assignment is " + a);// 0

	}
}
