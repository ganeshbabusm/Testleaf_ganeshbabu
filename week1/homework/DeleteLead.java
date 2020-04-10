/* Program to delete a lead and verify the record is deleted successfully*/

package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

			public static void main(String[] args) throws InterruptedException {
	//Launch Browser and URL
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
		
	//Login details
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
		
	//Navigation to Find lead
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByXPath("//a[text()='Find Leads']").click();
		
	//Click on the Phone tab and enter Phone Number
			driver.findElementByXPath("//span[text()='Phone']").click();
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("7174141148");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(2000);
			
	//Get the Lead ID from the table and store in String
			String text = driver.findElementByXPath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first '])//a").getText();
			System.out.println("Lead ID is "+text);
		
	//Click the first element in the table and then delete it	
			driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
			driver.findElementByXPath("(((//div[@class='frameSectionExtra'])[2])/a)[4]").click();
		
			driver.findElementByXPath("//a[text()='Find Leads']").click();
	
	//Pass the Lead ID and check if the record is available
			driver.findElementByXPath("(//label[text()='Lead ID:']/following::input)[1]").sendKeys(text);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(3000);
			
	//Get the record available from the grid
			String text2 = driver.findElementByXPath("//div[@class='x-toolbar x-small-editor']//div").getText();
			System.out.println(text2);
			
			if (text2.equals("No records to display"))
			{
				System.out.println("Expected message is correct");
			} else 
			System.out.println("Expected message is NOT correct");
				
			
					
	}

}

/* This is working as expected */
