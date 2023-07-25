package mmt.calendarDemo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDemo {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		test1();
		test2();
	}
	
	private static void test1() throws InterruptedException {
		CalendarDemo cd = new CalendarDemo();
		cd.setUp();
		cd.navigateToSite();
		cd.selectDate(20, 1, 2024);
		cd.tearDown();
	}

	private static void test2() throws InterruptedException {
		CalendarDemo cd = new CalendarDemo();
		cd.setUp();
		cd.navigateToSite();
		cd.selectDate(20, 12, 2023);
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

		// December 2023

		LocalDate date = LocalDate.now();

		if (dd < 1 || dd > 31 || mm < 1 || mm > 12 || yy < date.getYear() || mm > (date.getYear() + 1)) {
			System.out.println("Invalid date " + dd + "/" + mm + "/" + yy);
			return;
		}

		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();

		Thread.sleep(2000);

		System.out.println(date);

		System.out.println(date.getMonth() + "|" + date.getDayOfMonth() + "|" + date.getYear());

		int currentMonth = date.getMonthValue();

		System.out.println(currentMonth);

		// YEAR SELECTION
		int yearDiff = yy - date.getYear();
		if (yearDiff > 0) {
			// run the loop to select the desired year
			int loopCounter = (12 - date.getMonthValue()) * yearDiff;
			for (int i = 0; i < loopCounter; i++) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		// MONTH SELECTION
		String leftMonthGrid = driver.findElement(By.xpath("(//div[@role='heading'])[1]")).getText();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
		LocalDate localDate = LocalDate.parse("1 "+leftMonthGrid, formatter);
		System.out.println(localDate);
		
		int monthDiff = mm - localDate.getMonthValue();
		if (monthDiff > 0) {
			// Click on next month icon till the desired month is selected in left month
			// grid
			for (int i = 0; i < monthDiff; i++) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		// div[contains(@aria-label,'Jan 23 2023')]
		String datee = mm +"/"+dd+"/"+yy;
		formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
		localDate = LocalDate.parse(datee, formatter);
		System.out.println(localDate);
		String month = localDate.getMonth().toString();
		month = month.substring(0, 1)+month.substring(1, 3).toLowerCase();
		System.out.println(month);
		String selectDate = month + " " + dd + " " + yy;

		System.out.println(selectDate);
		driver.findElement(By.xpath("//div[contains(@aria-label,'" + selectDate + "')]")).click();
		Thread.sleep(2000);
	}

}
