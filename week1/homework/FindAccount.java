/* Simple program to find an existing account */

package week1.homework;

//import java.util.List;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser and URL
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
		
		//Login details
			driver.findElementById("username").sendKeys("DemoCSR");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
		
		//Navigation to Find Account
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Accounts").click();
			driver.findElementByLinkText("Find Accounts").click();
			
		//Pass the Account details to Find Account
			driver.findElementByXPath("(//input[@name='accountName'])[2]").sendKeys("Demo");
			driver.findElementByXPath("//button[text()='Find Accounts']").click();
			Thread.sleep(3000);
			
		//Select the first record in the grid
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)").click();
			
		// Click the Edit Button
			driver.findElementByXPath("(//div[@class='frameSectionExtra']/a)[1]").click();
		
		//Verify if the Account Name is correct 
				String attribute = driver.findElementByXPath("//input[@id = 'accountName']").getAttribute("value");
									
				if (attribute.equals("March Closing"))
				{
					System.out.println("Account Name is March Closing which is CORRECT");
				}else System.out.println("Account Name is incorrect");
				
		//Verify if the Description is correct 
				String attribute2 = driver.findElementByXPath("//textarea[@name='description']").getAttribute("value");
									
				if (attribute2.contains("sales"))
				{
					System.out.println("Description is CORRECT");
				}else System.out.println("Description is incorrect");
				
		//Verify Title is correct
				String title = driver.getTitle();
				
				if (title.equalsIgnoreCase("Edit Account | opentaps CRM"))
				{
					System.out.println("Title is correct");
				}else System.out.println("Title is incorrect");
				
				
				
	}

}

/* This is working as expected */
