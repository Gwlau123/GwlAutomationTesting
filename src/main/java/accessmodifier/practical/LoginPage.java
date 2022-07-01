package accessmodifier.practical;


/**
 * This class is a sample class for managing the page objects of the application under test
 * @author Vijay
 * */
public class LoginPage {

	private String userName="vijay.gangrade";
	private String password = "Test@532432";
	private String loginButton = "Sign-in";
	
	public void performLogin() {
		System.out.println("Performing the login action");
		System.out.println(userName + " is filled");
		System.out.println(password + " is filled");
		System.out.println(loginButton + " is clicked");
	}
	
}
