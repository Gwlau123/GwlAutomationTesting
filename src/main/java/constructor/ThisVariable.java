package constructor;
//this keyword is useful to distinguish between global and local variables.
//this is referring to current object in execution. 

public class ThisVariable {
 int i = 10; //Global Variable
 
	public void m1() 
	{
		int i =20; // Local Variable
		System.out.println(i);
		System.out.println(this.i);//this keyword is useful to distinguish between global and local variables which are having same name.
	}
	public void m1(int i)
	{
		this.i = i;
	}
   public static void main(String []args)
   {
	new ThisVariable().m1();
	new ThisVariable().m1(30);
   }
   

}

