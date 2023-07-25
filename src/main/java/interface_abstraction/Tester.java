package interface_abstraction;

public class Tester extends Object{
	public static void main(String[] args) {
		Animal a = new Wolf();
		System.out.println(a.getClass());
		System.out.println(a.toString());
	}
}
