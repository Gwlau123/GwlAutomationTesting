package constructor;
//Constructor Overloading
public class Student {

	public static void main(String[] args)
	{
		Student obj1 = new Student();
		obj1.displayResult();
	}
	
	public Student() // default
	{
		System.out.println("Hello");
	}
	public Student(String schoolName)//number of arguments
	{
		System.out.println("Hello");
	}
	public Student(int rank)// type of arguments
	{
		System.out.println("Hello");
	}
	public Student(String schoolName,int rank)//order of arguments
	{
		System.out.println("Hello");
	}
	public Student(int rank,String schoolName)//order of arguments
	{
		System.out.println("Hello");
	}
	public void displayResult()
	{
		System.out.println("Marks are 80");
	}
}
