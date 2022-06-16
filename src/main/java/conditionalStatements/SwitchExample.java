package conditionalStatements;

public class SwitchExample 
{

	public static void main(String[] args) 
	{
		//Declaring a variable for switch expression  
	   // int number = 10;  
	    
	    String browser = "Chrome";
	    
	    //Switch expression  
	    switch(browser)
	    {  
	    //Case statements  
	    case "Chrome" : System.out.println("Chrome Browser will launched");  
	    break;  
	    
	    case "": System.out.println("Your given numver is 20");  
	    break;  
	    
	    case " ": System.out.println("Your given numver is 30");  
	    break;  
	    
	    //Default case statement  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  
	}

}
