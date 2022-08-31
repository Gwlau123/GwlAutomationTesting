package collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MapDemo {
	public static void main(String[] args) throws IOException {

		// create file input stream object for the properties file
		FileInputStream fis = new FileInputStream(
				"D:\\Githubworkspace\\GwlAutomationTesting\\configs\\Configuation.properties");
		// create Properties class object to access properties file
		Properties prop = new Properties();
		// load the properties file
		prop.load(fis);
		// get the property of "Name" using getProperty()
		System.out.println("Name = " + prop.getProperty("Name"));

		// set the property of "url" using setProperty()
		prop.setProperty("url", "www.google.com");
		System.out.println("URL = " + prop.getProperty("url"));

//		System.out.println("Password = " + prop.getProperty("Password"));
//		prop.put("Password", "Amplify@123");
//		System.out.println("After Password = " + prop.getProperty("Password"));
	}
}
