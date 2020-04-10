/* Simple program to create a lead */

package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		//Navigation to create lead
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
		
		//Enter details to create lead
			driver.findElementById("createLeadForm_companyName").sendKeys("SMGB TECH");
			driver.findElementById("createLeadForm_firstName").sendKeys("GaneshBabu");
			driver.findElementById("createLeadForm_lastName").sendKeys("Moni");
			driver.findElementByClassName("smallSubmit").click();
	}

}

/* This is working as expected */