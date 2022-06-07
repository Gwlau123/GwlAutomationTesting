package operator;

public class LogicalOperator {
	public static void main(String[] args) {

		// ! > Logical Not > It toggles [true <> false]
		int a = 17, b = 20;
		boolean flag = a < b;
		System.out.println("Inital value = " + flag);
		System.out.println("After applying not operator = " + !flag);

		// && > Logical And > if both are true then true
		int x = 17, y = 20, z = 50;
		flag = x < y && y < z;
		System.out.println("After applying && operator = " + flag);

		// || > Logical Or > if single is true then true
		flag = x < y || y > z;
		System.out.println("After applying || operator = " + flag);

	}
}
