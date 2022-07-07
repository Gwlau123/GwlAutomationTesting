package constructor;
//Constructor is useful to initialize the variables in the class
public class Car {
int i; //Global variable // Default values for integer is 0

public Car() {
	i=10;
}

public static void main(String[]args)
{
	Car c1 = new Car();
	System.out.println(c1.i);
}
}
