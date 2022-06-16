package accessmodifier.practical;

/**
 * This is the base class to manage the setup and teardown of Driver/Browser objects
 * @author Vijay 
 * */
class BaseTest {
	
	private String browser = "Chrome";
	
	protected void setUp() {
		System.out.println(browser + " Browser Launched");
	}
	
	protected void tearDown() {
		System.out.println(browser + " Browser Quit");
	}
	
}
