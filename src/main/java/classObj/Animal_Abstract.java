package classObj;

public abstract class Animal_Abstract {
	
	protected String species;

	protected final void born() {
		System.out.println("Animal :- born");
	}

	protected void eat() {
		System.out.println("Animal :- eat");
	}
	
	protected void sleep() {
		System.out.println("Animal :- sleep");
	}
	
	public abstract void makeSound();

	public abstract void move();
	
}
