/* Program to create a lead using dropdown selection */

package week1.homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadDD {

	public static void main(String[] args) {
		
		//Launch Browser and URL
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			
		//Login details
			driver.findElementById("username").sendKeys("DemoCSR");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			
		//Navigation to create lead
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			
		//Enter details to create lead
			driver.findElementById("createLeadForm_companyName").sendKeys("SM TECH");
			driver.findElementById("createLeadForm_firstName").sendKeys("Subra");
			driver.findElementById("createLeadForm_lastName").sendKeys("MoniGS");
			
		//Enter value for source field 
			WebElement sourceDD = driver.findElementById("createLeadForm_dataSourceId");
			Select checkDD = new Select (sourceDD);
			checkDD.selectByVisibleText("Employee");
			
		//Enter value for marketing field 			
			WebElement marketingDD = driver.findElementById("createLeadForm_marketingCampaignId");
			Select marketingDdown = new Select (marketingDD);
			marketingDdown.selectByValue("9001");
			
		//Enter value for industry field ( Select value as Telecommunications from the bottom (size-2) in Industry using SelectByIndex)
			WebElement IndustryDD = driver.findElementById("createLeadForm_industryEnumId");
			Select indDdown = new Select (IndustryDD);
			List<WebElement> options = indDdown.getOptions();
			int sizeDD = options.size();
			indDdown.selectByIndex(sizeDD-2);
							
		//Enter value for ownership field			
			WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
			Select ownershipDD = new Select (ownership);
			ownershipDD.selectByIndex(5);
			
		//Enter value for country field	
			WebElement Country = driver.findElementById("createLeadForm_generalCountryGeoId");
			Select CountryDD = new Select (Country);
			CountryDD.selectByVisibleText("India");
			
			//driver.findElementByName("submitButton").click();
			
		//Get Title of the resulting page
			String title = driver.getTitle();
			System.out.println("Title of the resulting page is "+ title);
			
			
/* This is working as expected */
					
			
			
			
			
			
	}

}
