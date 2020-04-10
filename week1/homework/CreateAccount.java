/* Simple program to create an Account */

package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		//Launch Browser and URL
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
		//Login details
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				
		//Navigation to create Account
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Accounts").click();
				driver.findElementByLinkText("Create Account").click();
				
		//Enter details to create Account
				driver.findElementById("accountName").sendKeys("XYZ Airlines");
				driver.findElementById("groupNameLocal").sendKeys("Make Country Smaller");
				driver.findElementById("officeSiteName").sendKeys("Our Airlines");
				driver.findElementById("annualRevenue").sendKeys("50,000");
				driver.findElementByClassName("smallSubmit").click();
								
	}

}

/* This is working as expected */
