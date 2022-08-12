# Encapsulation in Java
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

We can create a fully encapsulated class in Java by making all the data members of the class private. 
	
Now we can use setter and getter methods to set and get the data in it.

The Java Bean class is the example of a fully encapsulated class.


# What can happen if we don't use Encapsulation

![Flat Cat](cat-0.jfif) 
![Flat Snake](snake-0.jpg)

# Advantage of Encapsulation in Java
By providing only a setter or getter method, you can make the class "read-only" or "write-only". 
	
In other words, you can skip the getter or setter methods.
	
It provides you the "control over the data". 
Suppose you want to set the value of id which should be greater than 100 only, 
you can write the logic inside the setter method. 
You can write the logic not to store the negative numbers in the setter methods.
	
It is a way to achieve "data hiding" in Java because other class will not be able to access the data 	through the private data members.
	
The encapsulate class is "easy to test". So, it is better for unit testing.
	
The standard IDE's are providing the facility to generate the getters and setters. So, it is "easy and fast 	to create an encapsulated class" in Java.
	
# Example
	class Account {  
	
		//private data members  
		private long acc_no;  
		private String name,email;  
		private float amount;  
	
		//public getter and setter methods  
		public long getAcc_no() {  
		    return acc_no;  
		}  
		
		public void setAcc_no(long acc_no) {  
		    this.acc_no = acc_no;  
		}  
		
		public String getName() {  
		    return name;  
		}  
		
		public void setName(String name) {  
		    this.name = name;  
		}  
		
		public String getEmail() {  
		    return email;  
		}  
		
		public void setEmail(String email) {  
		    this.email = email;  
		}  
		
		public float getAmount() {
			if(checkAuthorization()){  
		    	return amount;  
		    }
		}  
		
		public void setAmount(float amount) {
			if(amount<0){
				throw InvalidAmountException();
			}else{  
		    	this.amount = amount;
		    }  
		}  
	  
	}  

	
	
	public class TestEncapsulation {  
		public static void main(String[] args) {  
		    
		    //creating instance of Account class  
		    Account acc=new Account();  
		    
		    //setting values through setter methods  
		    acc.setAcc_no(7560504000L);  
		    acc.setName("John Doe");  
		    acc.setEmail("johndow@gmail.com");  
		    acc.setAmount(500000f);  
		    
		    //getting values through getter methods  
		    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
		}  
	}  




  	 