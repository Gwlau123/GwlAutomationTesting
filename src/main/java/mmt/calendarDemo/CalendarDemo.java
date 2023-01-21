package mmt.calendarDemo;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarDemo {
	
	static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {

		CalendarDemo cd = new CalendarDemo();		cd.setUp();
		cd.navigateToSite();
		cd.selectDate(12,1,2024);
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
		
		LocalDate date = LocalDate.now();
		
		if (dd < 1 || dd > 31 || mm < 1 || mm > 12 || yy < date.getYear() || mm > (date.getYear()+1)) {
			System.out.println("Invalid date "+dd+"/"+mm+"/"+yy);
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
			int loopCounter = (12-date.getMonthValue())*yearDiff;
			for (int i = 0; i < loopCounter; i++) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
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

		// div[contains(@aria-label,'Jan 23 2023')]
		String selectDate = getMonth(mm).substring(0, 3) + " " + dd + " " + yy;

		System.out.println(selectDate);
		driver.findElement(By.xpath("//div[contains(@aria-label,'"+selectDate+"')]")).click();
		Thread.sleep(2000);
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
	
	private String getMonth(int mm) {
		switch (mm) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Invalid month";
		}
	}

}
