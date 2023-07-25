package interface_abstraction;

public abstract class Canine extends Animal {
	
	@Override
	public void m1() {
		System.out.println("M1");
	}
	
	@Override
	public void roam() {
		System.out.println("Roam alone");
	}
}
