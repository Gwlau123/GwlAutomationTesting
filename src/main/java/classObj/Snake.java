package classObj;

public class Snake extends Animal_Abstract {
	
	public Snake(String breed, String name, String color, int age) {
		super.born();
		super.species = "Reptile";
		this.breed = breed;
		this.name = name;
		this.color = color;
		this.age = age;
		giveIntro();
	}

	private String breed;
	private String name;
	private String color;
	private int age;

	private void giveIntro() {
		System.out.println("Hi I am "+super.species+" type Animal, my name is "+name+", I am of "+breed+" breed, I am "+age+" yr old, my color is "+color);
	}
	
	
	public void makeSound() {
		System.out.println("Snake :- I make Hiss sound!");
	}

	public void move() {
		System.out.println("Snake :- Crawl");
	}
}
