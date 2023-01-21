package mmt.calendarDemo;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDemo {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		CalendarDemo cd = new CalendarDemo();
		cd.setUp();
		cd.navigateToSite();
		cd.selectDate(25, 1, 2023);
		cd.tearDown();

	}

	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void tearDown() {
		driver.quit();
	}

	private void navigateToSite() throws InterruptedException {
		driver.get("https://www.makemytrip.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		Thread.sleep(2000);
	}

	/**
	 * @param dd   = 27
	 * @param mm   = 12
	 * @param year = 2023
	 * @throws InterruptedException 
	 * 
	 */
	public void selectDate(int dd, int mm, int yy) throws InterruptedException {
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		Thread.sleep(2000);
		
		LocalDate date = LocalDate.now();

		System.out.println(date);

		System.out.println(date.getMonth() + "|" + date.getDayOfMonth() + "|" + date.getYear());

		int currentMonth = date.getMonthValue();

		System.out.println(currentMonth);

		// YEAR SELECTION
		int yearDiff = yy - date.getYear();
		if (yearDiff > 0) {
			// run the loop to select the desired year
		}

		// MONTH SELECTION
		String leftMonthGrid = driver.findElement(By.xpath("(//div[@role='heading'])[1]")).getText();
		int monthDiff = mm - getMonth(leftMonthGrid);
		if (monthDiff > 0) {
			// Click on next month icon till the desired month is selected in left month grid
			for (int i = 0; i < monthDiff; i++) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		leftMonthGrid = driver.findElement(By.xpath("(//div[@role='heading'])[1]")).getText();
		// div[contains(@aria-label,'Jan 23 2023')]
		String selectDate = leftMonthGrid.substring(0, 3) + " " + dd + " " + yy;

		System.out.println(selectDate);
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+selectDate+"')]")).click();

	}

	private int getMonth(String mm) {
		if (mm.toLowerCase().contains("january")) {
			return 1;
		} else if (mm.toLowerCase().contains("february")) {
			return 2;
		} else if (mm.toLowerCase().contains("march")) {
			return 3;
		} else if (mm.toLowerCase().contains("april")) {
			return 4;
		} else if (mm.toLowerCase().contains("may")) {
			return 5;
		} else if (mm.toLowerCase().contains("june")) {
			return 6;
		} else if (mm.toLowerCase().contains("july")) {
			return 7;
		} else if (mm.toLowerCase().contains("August")) {
			return 8;
		} else if (mm.toLowerCase().contains("september")) {
			return 9;
		} else if (mm.toLowerCase().contains("october")) {
			return 10;
		} else if (mm.toLowerCase().contains("november")) {
			return 11;
		} else if (mm.toLowerCase().contains("december")) {
			return 12;
		}
		return -1;
	}

}
