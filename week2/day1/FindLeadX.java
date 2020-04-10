/* Program to find lead using Xpath */

package week2.day1;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeadX {

	public static void main(String[] args) throws InterruptedException {
		//Find lead program using Xpath only
		
		//Launch Browser and URL
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Login details
		driver.findElementByXPath("//input[@class = 'inputLogin']").sendKeys("DemoCSR");
		driver.findElementByXPath("//input[@type ='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@class = 'decorativeSubmit']").click();
		
		driver.findElementByXPath(" //div[@for = 'crmsfa']").click();
		
		driver.findElementByXPath(" //a[contains (text(),'Leads')]").click();
		driver.findElementByXPath(" //a[contains (text(),'Find Leads')]").click();
		
		driver.findElementByXPath("(//input[@name = 'firstName'])[3]").sendKeys("Ganesh");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
	}

}

/* This is working as expected */