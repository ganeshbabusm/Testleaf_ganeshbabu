/* Program to check all the dropdown values starting with P */

package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadArray {

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
			List<WebElement> options = checkDD.getOptions();
			int size = options.size();
			for (int i = 0; i < size; i++) {
				WebElement Values = options.get(i);
				String text = Values.getText();
				if (text.startsWith("P")){
					System.out.println("Values matching with P are "+text);
				}
			
				
			}
			
			
		
	}

}

/* This is working as expected */
