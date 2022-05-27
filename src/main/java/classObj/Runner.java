package classObj;

public class Runner {
	public static void main(String[] args) {

		Animal_Abstract sheruTheDog = new Dog("Lab", "Sheru", "Brown", 5);

		sheruTheDog.makeSound();
		sheruTheDog.move();
		sheruTheDog.eat();
		sheruTheDog.sleep();

		System.out.println("======================================");
		
		Animal_Abstract kaliaTheSnake = new Snake("Cobra", "Kaila", "Balck", 2);

		kaliaTheSnake.makeSound();
		kaliaTheSnake.move();
		kaliaTheSnake.eat();
		kaliaTheSnake.sleep();

	}
}
