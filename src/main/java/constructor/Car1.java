package constructor;
public class Car1 {
		int i; //Global variable // Default values for integer is 0

		public Car1() { //Default Constructor
			i=10;
		}
		
		public Car1(int j) //Parameterized Constructor
			{
			i=j;
			}
			
		public static void main(String[] args)
		{
			Car1 c1 = new Car1();
			System.out.println(c1.i);
			
			Car1 c2 = new Car1(30);
			System.out.println(c2.i);
			
		}
		
		}
