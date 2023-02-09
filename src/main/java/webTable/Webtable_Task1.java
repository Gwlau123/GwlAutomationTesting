package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_Task1 {
	
	/*Test case -Find the Country of Adobe */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebTable webtab = new WebTable(By.id("customers"), driver);
		webtab.initHeaderColumnList(1);
		int row = webtab.getRowWithCellText("Meta");
		int col= webtab.getColumnNumber("Country");

		String cellText= webtab.getCellText(row, col);
		
		System.out.println(cellText);
		
		
	}

}
