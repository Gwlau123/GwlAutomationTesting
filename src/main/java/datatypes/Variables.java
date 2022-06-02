package datatypes;

public class Variables {

	private final static int WAIT_CONST = 30;

	private int instanceVar;

	private static int classVar;

	public static void main(String[] args) {
		int localVar;

		// Accessing, setting and getting value in LOCAL variable
		localVar = 200;
		System.out.println("Local Var "+ localVar);

		// Accessing, setting and getting value in STATIC variable
		Variables.classVar = 100;
		System.out.println("Class Var "+ Variables.classVar);
		System.out.println("Constant Var "+ Variables.WAIT_CONST);

		// Accessing, setting and getting value in OBJECT/INSTANCE variable

		Variables obj1 = new Variables();
		obj1.instanceVar = 500;
		System.out.println("Instance Var "+ obj1.instanceVar);
		obj1.classVar = 600;
		System.out.println("Class Var "+ obj1.classVar);

		Variables obj2 = new Variables();
		obj2.instanceVar = 200;
		System.out.println("Instance Var "+ obj2.instanceVar);
		System.out.println("Class Var "+ obj2.classVar);
		System.out.println("Class Var "+ Variables.classVar);
		System.out.println("Class Var "+ obj1.classVar);
	}

}
