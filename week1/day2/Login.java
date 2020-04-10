package week1.day2;

// Program to create a lead

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		//To launch browser
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
		//Load URL
			driver.get("http://leaftaps.com/opentaps/");
			String title = driver.getTitle();
			System.out.println("The Window Title is "+ title);
		
		//Pass the username and password
			WebElement eleUName = driver.findElementById("username");
			eleUName.sendKeys("DemoSalesManager");
			Thread.sleep(5000);
			driver.findElementById("password").sendKeys("crmsfa");
		
		//Submit or click actions
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
	
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("SMGB Tech Solutions");
				driver.findElementById("createLeadForm_firstName").sendKeys("GaneshBabu");
				driver.findElementById("createLeadForm_lastName").sendKeys("SubraMoni");
				driver.findElementByClassName("smallSubmit").click();
							
				driver.close();
				
	}

}


/* This is working as expected */