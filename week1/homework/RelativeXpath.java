/* Program to Create Lead based on Relative X Path */

package week1.homework;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RelativeXpath {

	public static void main(String[] args) {
		//Launch Browser and URL
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				driver.findElementByXPath("//label[@for='username']/following-sibling::input").sendKeys("DemoSalesManager");
				driver.findElementByXPath("//label[@for='password']/following-sibling::input").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
			
		//Navigation to create lead
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				
				driver.findElementByXPath("//span[text() ='Company Name']/following::input").sendKeys("ND TECH");
				driver.findElementByXPath("//span[text() ='First name']/following::input").sendKeys("Vicari");
				driver.findElementByXPath("//span[text() ='Last name']/following::input").sendKeys("Deb");	
				
				WebElement Ownership = driver.findElementByXPath("//select[@id='createLeadForm_ownershipEnumId']");
				Select Oship = new Select(Ownership);
				Oship.selectByVisibleText("Public Corporation");
				
				WebElement MC = driver.findElementByXPath("//select[@id='createLeadForm_marketingCampaignId']");
				Select MCP = new Select(MC);
				MCP.selectByVisibleText("Car and Driver");
				driver.findElementByClassName("smallSubmit").click();

	}

}

/* This is working as expected */