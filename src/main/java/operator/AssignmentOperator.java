package operator;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a;
		// = Operator 
		a =10;//a would be assign with value 10
		System.out.println("The value of a is equal to"+a);
		//+= operator compound assignment operator or Add AND assignment operator. 
		a+=10; // a= a+10
		System.out.println(a);//20
		//-= Subtract AND assignment operator. 
		a-=10; //a=a-10
		System.out.println(a);//10
		//*=	Multiply AND assignment operator
		a*=10;//a=a*10
		System.out.println(a);//100
		// /= Divide AND assignment operator.
		a/=10;
		System.out.println(a);//10
		// %= 	Modulus AND assignment operator
		 a%=10;
		 System.out.println(a);
	
}
}