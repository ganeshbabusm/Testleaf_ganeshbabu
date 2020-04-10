/* Program to select an option in FlipKart */

package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FKartTV {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser and URL
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		WebElement TV = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		
		Actions builder= new Actions (driver);
		
		builder.moveToElement(TV).perform();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[text()='LG']").click();
			
		String text = driver.findElementByXPath("(//div[@class='_1-2Iqu row']//div)[2]").getText();
		System.out.println(text);

	}

}

/* This is working as expected */