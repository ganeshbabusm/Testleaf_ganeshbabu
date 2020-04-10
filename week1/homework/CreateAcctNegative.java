
/* Program to retrieve the error message after submitting a form */

package week1.homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAcctNegative {

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
					driver.findElementByName("description").sendKeys("NRI Account");
					driver.findElementById("groupNameLocal").sendKeys("Make Nation Smaller");
					driver.findElementById("officeSiteName").sendKeys("My Airlines");
					driver.findElementByClassName("smallSubmit").click();
					
					String text = driver.findElementByXPath("//div[@class='messages']").getText();
					System.out.println(text);
					
					/*String text1 = driver.findElementByXPath("(//div[@class ='centerarea']//div)[2]").getText();
					System.out.println(text1);
					String text2 = driver.findElementByXPath("(//div[@class ='centerarea']//li)[1]").getText();
					System.out.println(text2); */

	}

}

/* This is working as expected */