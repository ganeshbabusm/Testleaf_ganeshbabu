/* Program to edit lead using regex */

package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		
		driver.findElementByXPath("(((//label[text()='First name:'])[3])/following::input)[1]").sendKeys("Ganesh");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		
		// We have to introduce sleep since it takes time to load the results 
		Thread.sleep(2000);
		
	//Select the first element in the grid
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
		
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
	// Select the Edit button
		driver.findElementByXPath("(((//div[@class='frameSectionExtra'])[2])/a)[3]").click();
	
	//Update record
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Nanjil TECH");
		driver.findElementByXPath("(//input[@name='submitButton'])[1]").click();
	
	// Verify company name - use regex 
		String companyName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(companyName);
		String compName = companyName.replaceAll("[^a-zA-Z\\s]", "").trim();
		
			if (compName.equals("Nanjil TECH"))
		{
			System.out.println("Updated company name is correct");
		} else System.out.println("Updated company name is NOT correct");
				System.out.println(compName);
		driver.close();

	}

}

/* This is working as expected */