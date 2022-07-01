package TestArray;

public class One_Array_Java
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// declaration and instantiation
        int a[] = new int[5];
        // initialization
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        // length is the property of array
        for(int i=0; i<a.length; i++)
        {
        	  System.out.println("One Array ["+i+"] = " +a[i]);
         }
    }
	
	
}
