package encapsulation;

public class Runner {
	public static void main(String[] args) {
		
		//TODO CAT OBJECTS
		System.out.println("CAT");
		
		Cat d1 = new Cat();
		
		System.out.println(d1.getName() + d1.getHeight());

		d1.setName("Tom - House Cat ");
		d1.setHeight(0);
		
		System.out.println(d1.getName() + d1.getHeight());

		d1.setHeight(100);

		System.out.println(d1.getName() + d1.getHeight());

		d1.setHeight(10);

		System.out.println(d1.getName() + d1.getHeight());
		
		d1.setHeight(0);

		System.out.println(d1.getName() + d1.getHeight());

		
		d1.height = 0;
		
		System.out.println(d1.getName() + d1.getHeight());
		
		//TODO CAT OBJECTS
		System.out.println("SNAKE");
		Snake s1 = new Snake();
		
		System.out.println(s1.getName() + s1.getLength());

		s1.setName("Kalia - Cobra Snake ");
		s1.setLength(0);
		
		System.out.println(s1.getName() + s1.getLength());

		s1.setLength(100);

		System.out.println(s1.getName() + s1.getLength());

		s1.setLength(10);

		System.out.println(s1.getName() + s1.getLength());
		
		s1.length = 0;
		
		System.out.println(s1.getName() + s1.getLength());
	}
}
