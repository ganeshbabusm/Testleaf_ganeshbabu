/* Program to create a duplicate lead and verify the duplicate lead name is same as original record */

package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	
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
					
					driver.findElementByXPath("//span[text()='Email']").click();
					driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("ganeshbabusm@gmail.com");
					driver.findElementByXPath("//button[text()='Find Leads']").click();
					Thread.sleep(2000);
					
					String FName = driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a").getText();
					System.out.println(FName);
					
					driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();
					
					driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
					
					String PageTitle = driver.findElementByXPath("//div[text()='Duplicate Lead']").getText();
					System.out.println(PageTitle);
					if (PageTitle.equals("Duplicate Lead"))
					{
						System.out.println("Title is correct");
						} else System.out.println("Page Title is NOT correct");
					
					driver.findElementByXPath("//input[@value='Create Lead']").click();
					
					String NameofDup = driver.findElementById("viewLead_firstName_sp").getText();
							System.out.println(NameofDup);
							if (NameofDup.equals(FName))
							{
								System.out.println("Duplicated lead name is same as captured name");
							} else System.out.println("Duplicated lead name is different from captured name");
						
	}

}

/* This is working as expected */
