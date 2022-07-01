package accessmodifier.practical;

/**
 * This is the sample code to explain the TestRunner
 * @author Vijay
 * */
public class TestRunner extends BaseTest {
	
	/**
	 * This is how a typical test execution works
	 * */
	public static void main(String[] args) {
		
		BaseTest test = new BaseTest();
		
		test.setUp();
		
		LoginPage lo = new LoginPage();
		
		lo.performLogin();
		
		System.out.println("1,2,3 .... STEPS");
		
		test.tearDown();
		
	}
	
}
